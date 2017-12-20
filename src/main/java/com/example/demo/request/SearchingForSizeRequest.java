package com.example.demo.request;

public class SearchingForSizeRequest {

    private int size;

    public SearchingForSizeRequest(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SearchingForSizeRequest{" +
                "size=" + size +
                '}';
    }
}