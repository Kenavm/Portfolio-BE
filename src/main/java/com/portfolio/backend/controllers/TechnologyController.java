package com.portfolio.backend.controllers;

import com.portfolio.backend.models.Technology;
import com.portfolio.backend.services.TechnologyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/v1/technologies")
@CrossOrigin(origins = "http://localhost:5173")
public class TechnologyController {

    private final TechnologyService technologyService;

    public TechnologyController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }

    @GetMapping
    public List<Technology> findAll() {
        return technologyService.getAllTechnologies();
    }

    @GetMapping("{id}")
    public Set<Technology> getTechnologiesByPortfolioId(@PathVariable long id) {
        return technologyService.getTechnologiesByPortfolioId(id);
    }
}
