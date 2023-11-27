package com.portfolio.backend.controllers;

import com.portfolio.backend.exceptions.NoEntryByThisIdFoundException;
import com.portfolio.backend.exceptions.NoUpdatedEntryFoundException;
import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.services.PortfolioService;
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
    public ResponseEntity<List<PortfolioEntry>> getAllEntries() {
        List<PortfolioEntry> entries = service.findAll();
        return ResponseEntity.ok(entries);
    }

    @GetMapping("{id}")
    public ResponseEntity<List<PortfolioEntry>> getEntriesById(@PathVariable Long id) {
        List<PortfolioEntry> entries = service.findEntriesById(id);
        return ResponseEntity.ok(entries);
    }

    @PostMapping
    public ResponseEntity<String> addNewEntry(@RequestBody PortfolioEntry entry) {
        service.save(entry);
        return ResponseEntity.accepted().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<String> editEntry(@PathVariable Long id, @RequestBody PortfolioEntry entry) throws NoUpdatedEntryFoundException, NoEntryByThisIdFoundException {
        service.update(id, entry);
        return ResponseEntity.accepted().build();
    }
}
