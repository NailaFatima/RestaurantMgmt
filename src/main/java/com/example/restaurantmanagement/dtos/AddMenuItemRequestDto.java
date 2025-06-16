package com.example.restaurantmanagement.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddMenuItemRequestDto {

    private long userId;
    private String name;
    private double price;
    private String dietaryRequirement;
    private String itemType;
    private String description;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDietaryRequirement(String dietaryRequirement) {
        this.dietaryRequirement = dietaryRequirement;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
