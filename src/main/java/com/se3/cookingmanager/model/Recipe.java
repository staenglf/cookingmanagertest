package com.se3.cookingmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Recipe implements Serializable {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String ingredient1;
    private String amount1;
    private String explanation;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String recipeCode;

    public Recipe(){}

    public Recipe(String name, String ingredient1, String amount1, String explanation, String imageUrl, String recipeCode){
        this.name = name;
        this.ingredient1 = ingredient1;
        this.amount1 = amount1;
        this.explanation = explanation;
        this.imageURL = imageUrl;
        this.recipeCode = recipeCode;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(String email) {
        this.ingredient1 = email;
    }

    public String getAmount1() {
        return amount1;
    }

    public void setAmount1(String jobTitle) {
        this.amount1 = jobTitle;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String phone) {
        this.explanation = phone;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getRecipeCode() {
        return recipeCode;
    }

    public void setRecipeCode(String recipeCode) {
        this.recipeCode = recipeCode;
    }

    @Override
    public String toString(){
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + ingredient1 + '\'' +
                ", jobTitle='" + amount1 + '\'' +
                ", phone='" + explanation + '\'' +
                ", imageUrl='" + imageURL + '\'' +
                '}';
    }
}
