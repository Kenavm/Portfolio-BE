package com.portfolio.backend.models;

import com.portfolio.backend.models.enums.Authority;
import org.springframework.security.core.GrantedAuthority;
import jakarta.persistence.*;

@Entity
@Table(name="roles")
public class Role implements GrantedAuthority{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="role_id")
    private Integer roleId;

    private Authority authority;

    public Role(){
        super();
    }

    public Role(Authority authority){
        this.authority = authority;
    }

    public Role(Integer roleId, Authority authority){
        this.roleId = roleId;
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority.toString();
    }

    public void setAuthority(Authority authority){
        this.authority = authority;
    }

    public Integer getRoleId(){
        return this.roleId;
    }

    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }
}
