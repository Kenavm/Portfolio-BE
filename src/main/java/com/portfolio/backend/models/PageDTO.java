package com.portfolio.backend.models;

import java.util.List;

public class PageDTO {

    private PublicUser publicUser;
    private List<PortfolioEntry> portfolioEntryList;

    public PageDTO(PublicUser publicUser, List<PortfolioEntry> portfolioEntryList) {
        this.publicUser = publicUser;
        this.portfolioEntryList = portfolioEntryList;
    }

    public PublicUser getPublicUser() {
        return publicUser;
    }

    public void setPublicUser(PublicUser publicUser) {
        this.publicUser = publicUser;
    }

    public List<PortfolioEntry> getPortfolioEntryList() {
        return portfolioEntryList;
    }

    public void setPortfolioEntryList(List<PortfolioEntry> portfolioEntryList) {
        this.portfolioEntryList = portfolioEntryList;
    }
}