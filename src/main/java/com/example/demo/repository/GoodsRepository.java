package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Goods;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Integer>, JpaSpecificationExecutor<Goods>{

    List<Goods> findByName(String name);


}
