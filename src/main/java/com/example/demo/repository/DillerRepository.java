package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Diller;
import org.springframework.stereotype.Repository;

@Repository
public interface DillerRepository extends JpaRepository<Diller, Integer>{

	
}
