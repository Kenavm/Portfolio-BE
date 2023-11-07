package com.portfolio.backend.controllers;

import com.portfolio.backend.models.Entry;
import com.portfolio.backend.services.PortfolioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/portfolio")
@CrossOrigin(origins = "http://localhost:5173")
public class PortfolioController {

    private final PortfolioService service;

    public PortfolioController(PortfolioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Entry>> getAllEntries() {
        List<Entry> entries = service.findAll();
        return ResponseEntity.ok(entries);
    }

    @PostMapping
    public ResponseEntity<String> addNewEntry(@RequestBody Entry entry) {
        service.save(entry);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
