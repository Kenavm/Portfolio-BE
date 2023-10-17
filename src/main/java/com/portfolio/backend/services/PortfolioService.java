package com.portfolio.backend.services;
@Component
public class PortfolioService {
    private List<Entry> portfolioList;

    public PortfolioService(List<entry> entryList) {
        this.entryList = entryList;
    }

    public Entry addEntry(Entry entry) {
        entryList.add(entry);
        return entry;
    }

    public List<Entry> getPortfolioList() {
        return portfolioList;
    }
}
