package com.example.demo.entities.helpers;

public class BidRequest {
    private String suggestion;
    private int price;

    public BidRequest(){}

    public BidRequest(String suggestion, int price) {
        this.suggestion = suggestion;
        this.price = price;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
