package com.example.restaurantmanagement.models;

import java.util.List;

public class Customer extends BaseModel{
    private String name;
    private int visitCount;
    private List<Bill> bills;

}
