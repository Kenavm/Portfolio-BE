package com.portfolio.backend.controllers;

import com.portfolio.backend.models.PageDTO;
import com.portfolio.backend.services.PageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicPageController {

    private final PageService pageService;

    public PublicPageController(PageService pageService) {
        this.pageService = pageService;
    }

    @GetMapping("/{id}")
    public PageDTO getPageData(@PathVariable long id) {
        return pageService.getPageDTO(id);
    }
}
