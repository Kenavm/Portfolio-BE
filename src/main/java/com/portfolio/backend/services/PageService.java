package com.portfolio.backend.services;

import com.portfolio.backend.models.PageDTO;
import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.models.PublicUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PageService {
    private final PortfolioService portfolioService;
    private final PublicUserService publicUserService;

    public PageService(PortfolioService portfolioService, PublicUserService publicUserService) {
        this.portfolioService = portfolioService;
        this.publicUserService = publicUserService;
    }

    public PageDTO getPageDTO(long privateUserId) {
        var publicUser = publicUserService.findUserByPrivateUserId(privateUserId);
        var portfolioEntryList = portfolioService.findEntriesById(privateUserId);
        return new PageDTO(publicUser,portfolioEntryList);
    }
}
