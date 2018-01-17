package com.example.demo.service;

import com.example.demo.entity.SubCategory;

import java.util.List;


public interface SubCategoryService {

    SubCategory save(SubCategory subCategory);

    SubCategory findByNameSubCategory(String nameSubCategory);

    List<SubCategory> findAll();

    SubCategory findOne(int id);

    boolean delete (int id);
}