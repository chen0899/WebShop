package com.example.demo.specification;

import com.example.demo.entity.Goods;
import com.example.demo.request.SearchingRequest;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class SearchingGoods implements Specification<Goods>{

    private SearchingRequest searchingRequest;

    public SearchingGoods(SearchingRequest searchingRequest) {
        this.searchingRequest = searchingRequest;
    }

    @Override
    public Predicate toPredicate(Root<Goods> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        CriteriaBuilder cb = criteriaBuilder;
        CriteriaQuery<?> cq = criteriaQuery;
        Root<Goods> goodsRoot = root;
        Predicate predicate = cb.like(goodsRoot.get("name"),"%"+searchingRequest.getGoodsName()+"%");
        return predicate;
    }
}