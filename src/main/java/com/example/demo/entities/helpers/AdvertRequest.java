package com.example.demo.entities.helpers;

public class AdvertRequest {
    private String name;
    private String description;
    private String company;
    private int price;
    private String img;
    private Long category;

    public AdvertRequest(){}

    public AdvertRequest(String name, String description, String company, int price, String img, Long category) {
        this.name = name;
        this.description = description;
        this.company = company;
        this.price = price;
        this.img = img;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Long getCategory() {
        return category;
    }

    public void setCategory(Long category) {
        this.category = category;
    }
}
