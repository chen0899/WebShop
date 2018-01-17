package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import com.example.demo.dto.GoodsDTO;
import com.example.demo.entity.Category;
import com.example.demo.entity.Country;
import com.example.demo.entity.SubCategory;
import com.example.demo.request.SearchingForSizeRequest;
import com.example.demo.request.SearchingRequest;
import com.example.demo.service.CategoryService;
import com.example.demo.service.CountryService;
import com.example.demo.service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Goods;
import com.example.demo.request.DeleteRequest;
import com.example.demo.service.GoodsService;

@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private SubCategoryService subCategoryService;
	
	@GetMapping
	public List<Goods> goods(){
		return goodsService.findAll();
	}
	
	@PutMapping
	public Goods save(@RequestBody GoodsDTO goodsDTO) throws IOException {

		Goods goods = new Goods();

		Category category = categoryService.findByName(goodsDTO.getNameCategory());

		Country country = countryService.findByNameCountry(goodsDTO.getNameCountry());

		SubCategory subCategory = subCategoryService.findByNameSubCategory(goodsDTO.getNameSubCategory());

		goods.setSubCategory(subCategory);

		goods.setCountry(country);

		goods.setCategory(category);

		goods.setId(goodsDTO.getId());

		goods.setName(goodsDTO.getName());

		goods.setPrice(goodsDTO.getPrice());

		goods.setSize(goodsDTO.getSize());

		goods.setAboutGoods(goodsDTO.getAboutGoods());

		goods.setPhoto(goodsDTO.getPhoto());

		return goodsService.save(goods);
	}

	@PostMapping("/search")
	public List<Goods> findGoods(@RequestBody SearchingRequest searchingRequest){
		return goodsService.find(searchingRequest);
	}




	@DeleteMapping
	public boolean delete(@RequestBody DeleteRequest request){
		return goodsService.delete(request.getId());
	}
}
