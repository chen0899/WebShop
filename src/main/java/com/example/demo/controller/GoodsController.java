package com.example.demo.controller;

import java.io.IOException;
import java.util.ArrayList;
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

import static java.util.stream.Collectors.toList;

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

	@GetMapping("find-all-by/{nameCategory}")
	public List<Goods>  findGoods(@PathVariable String nameCategory){
		return goodsService.findAll().stream().filter(goods1 -> goods1.getSubCategory().getName().equalsIgnoreCase(nameCategory)).collect(toList());
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

	@PostMapping("/search/{name}")
	public List<Goods> research(@PathVariable String name){
		return goodsService.research(name);
	}





	@DeleteMapping
	public boolean delete(@RequestBody DeleteRequest request){
		return goodsService.delete(request.getId());
	}
}
