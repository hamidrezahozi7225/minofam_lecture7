package com.company.Entity;

import java.util.Scanner;

public class SaipaEnti {
    private String name,color;
    private int price,id;

    public String getName() {
        return name;
    }

    public SaipaEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getColor() {
        return color;
    }

    public SaipaEnti setColor(String color) {
        this.color = color;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public SaipaEnti setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getId() {
        return id;
    }

    public SaipaEnti setId(int id) {
        this.id = id;
        return this;
    }
}
