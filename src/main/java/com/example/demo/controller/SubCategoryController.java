package com.example.demo.controller;

import com.example.demo.entity.SubCategory;
import com.example.demo.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcategory")
@CrossOrigin
public class SubCategoryController {

    @Autowired
    private SubCategoryService subCategoryService;

    @PutMapping
    public SubCategory save(@RequestBody SubCategory subCategory) {
        return subCategoryService.save(subCategory);
    }

    @GetMapping
    public List<SubCategory> subCategories() {
        return subCategoryService.findAll();
    }




}