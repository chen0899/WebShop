package com.example.demo.service.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.Base64MultipartFile;
import com.example.demo.request.SearchingForSizeRequest;
import com.example.demo.request.SearchingRequest;
import com.example.demo.specification.SearchingGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Goods;
import com.example.demo.repository.GoodsRepository;
import com.example.demo.service.GoodsService;
import org.springframework.web.multipart.MultipartFile;
import sun.misc.BASE64Decoder;

@Service
public class GoodsServiceImpl implements GoodsService{

	private final static String PATH = "C://Users//chen0899//Desktop//Logos//imegesForProject";


	@Autowired
	private GoodsRepository goodsRepository;

	
	
	public Goods save(Goods goods) throws IOException {
		byte []filecontent;
		BASE64Decoder decoder = new BASE64Decoder();
		filecontent = decoder.decodeBuffer(goods.getPhoto().split(",")[1]);
		String expension = goods.getPhoto().split(",")[0].split("/")[1].split(";")[0];
		goods.setPhoto(null);
		goods = goodsRepository.saveAndFlush(goods);
		Base64MultipartFile multipartFile = new Base64MultipartFile(filecontent,goods.getId()+"."+expension);
		saveFile(multipartFile);
		goods.setPhoto("/images/"+goods.getId()+"."+expension);
		return goodsRepository.save(goods);
		
	}

	private void saveFile(MultipartFile file) throws IOException {
		File pathToFolder = new File(PATH);
		createFolder(pathToFolder);
		File newFile = new File(pathToFolder+"/"+file.getOriginalFilename());
		writeFile(newFile,file);

	}

	private void createFolder(File path){
		if(!path.exists()){
			path.mkdirs();
		}
	}

	private void writeFile(File file, MultipartFile multipartFile) throws IOException {
		try(OutputStream fos = new FileOutputStream(file); BufferedOutputStream bos = new BufferedOutputStream(fos)){
			bos.write(multipartFile.getBytes(),0,multipartFile.getBytes().length);
			bos.flush();
		}catch (IOException e) {

		}
	}

	public List<Goods> findAll() {
		return goodsRepository.findAll();
	}

	public Goods findOne(int id) {
		return goodsRepository.findOne(id);
	}

	public boolean delete(int id) {
		goodsRepository.delete(id);
		return true;
	}

	public List<Goods> find (SearchingRequest searchingRequest) {
		SearchingGoods searchingGoods = new SearchingGoods(searchingRequest);
		return goodsRepository.findAll(searchingGoods);

	}

}
