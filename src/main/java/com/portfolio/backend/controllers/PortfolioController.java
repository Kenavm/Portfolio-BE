package com.portfolio.backend.controllers;

import com.portfolio.backend.models.Entry;
import com.portfolio.backend.services.PortfolioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
@CrossOrigin(origins = "http://localhost:5173")
public class PortfolioController {

    private PortfolioService service;

    public PortfolioController(PortfolioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Entry>> getAllEntries() {
        // List<Entry> entries = service
        return ResponseEntity.ok(entries);
    }
}
