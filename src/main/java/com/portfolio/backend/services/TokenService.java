package com.portfolio.backend.services;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.jwt.*;
import org.springframework.stereotype.Service;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.time.Instant;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TokenService {
    private final JwtEncoder jwtEncoder;
    public static final String DELIMITER = ",";
    public static final String KEY_VALUE = "roles";

    public TokenService(JwtEncoder jwtEncoder) {
        this.jwtEncoder = jwtEncoder;
    }

    public String generateJwt(Authentication auth){

        Instant now = Instant.now();

        String scope = auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(" "));

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("self")
                .issuedAt(now)
                .subject(auth.getName())
                .claim("roles", scope)
                .build();

        return jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
    }

    public Collection<GrantedAuthority> extractAuthoritiesFromToken(Jwt jwt) {

        Map<String, Object> claims = jwt.getClaims();
        System.out.println(claims.toString());

        String claimAuthority = (String) claims.get(KEY_VALUE);
        System.out.println(claimAuthority);

        Collection<GrantedAuthority> authorities = Arrays.stream(claimAuthority.split(DELIMITER))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());

        System.out.println("Extracted Authorities from JWT Token: " + authorities);
        return authorities;
    }
}
