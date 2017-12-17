package com.example.demo.request;

public class SearchingRequest {

    private String goodsName;

    public SearchingRequest(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Override
    public String toString() {
        return "SearchingRequest{" +
                "goodsName='" + goodsName + '\'' +
                '}';
    }
}