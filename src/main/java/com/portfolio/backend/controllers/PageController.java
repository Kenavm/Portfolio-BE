package com.portfolio.backend.controllers;

import com.portfolio.backend.models.PageDTO;
import com.portfolio.backend.models.PortfolioEntry;
import com.portfolio.backend.models.PrivateUser;
import com.portfolio.backend.models.PublicUser;
import com.portfolio.backend.services.PageService;
import com.portfolio.backend.services.PortfolioService;
import com.portfolio.backend.services.PrivateUserService;
import com.portfolio.backend.services.PublicUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/page")
@CrossOrigin(origins = "http://localhost:5173")
public class PageController {

   private final PageService pageService;

    public PageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping("/{id}")
    public PageDTO getPageData(@PathVariable long id) {
        return pageService.getPageDTO(id);
    }

}