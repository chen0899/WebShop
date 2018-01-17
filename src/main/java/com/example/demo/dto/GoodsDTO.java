package com.example.demo.dto;

public class GoodsDTO {

    private int id;

    private String name;

    private int price;

    private String size;

    private String aboutGoods;

    private String photo;

    private String nameCountry;

    private String nameCategory;

    private String nameSubCategory;

    public GoodsDTO() {
    }

    public GoodsDTO(int id, String name, int price, String size, String aboutGoods, String photo, String nameCountry, String nameCategory, String nameSubCategory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.size = size;
        this.aboutGoods = aboutGoods;
        this.photo = photo;
        this.nameCountry = nameCountry;
        this.nameCategory = nameCategory;
        this.nameSubCategory = nameSubCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAboutGoods() {
        return aboutGoods;
    }

    public void setAboutGoods(String aboutGoods) {
        this.aboutGoods = aboutGoods;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getNameSubCategory() {
        return nameSubCategory;
    }

    public void setNameSubCategory(String nameSubCategory) {
        this.nameSubCategory = nameSubCategory;
    }

    @Override
    public String toString() {
        return "GoodsDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                ", aboutGoods='" + aboutGoods + '\'' +
                ", photo='" + photo + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                ", nameCategory='" + nameCategory + '\'' +
                ", nameSubCategory='" + nameSubCategory + '\'' +
                '}';
    }
}
