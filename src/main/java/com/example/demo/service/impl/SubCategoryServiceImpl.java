package com.example.demo.service.impl;

import com.example.demo.entity.SubCategory;
import com.example.demo.repository.SubCategoryRepository;
import com.example.demo.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{

    @Autowired
    private SubCategoryRepository subCategoryRepository;


    @Override
    public SubCategory save(SubCategory subCategory) {
        return subCategoryRepository.save(subCategory);
    }

    @Override
    public List<SubCategory> findll() {
        return subCategoryRepository.findAll();
    }

    @Override
    public SubCategory findOne(int id) {
        return  subCategoryRepository.findOne(id);
    }

    @Override
    public boolean delete(int id) {
        subCategoryRepository.delete(subCategoryRepository.findOne(id));
        return true;
    }
}