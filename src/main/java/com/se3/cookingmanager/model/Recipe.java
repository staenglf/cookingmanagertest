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
    private String ingredient2;
    private String ingredient3;
    private String ingredient4;
    private String ingredient5;
    private String ingredient6;
    private String ingredient7;
    private String ingredient8;
    private String ingredient9;
    private String amount1;
    private String amount2;
    private String amount3;
    private String amount4;
    private String amount5;
    private String amount6;
    private String amount7;
    private String amount8;
    private String amount9;
    private String explanation;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String recipeCode;

    public Recipe(){}

    public Recipe(String name, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, String ingredient6, String ingredient7, String ingredient8, String ingredient9, String amount1, String amount2, String amount3, String amount4, String amount5, String amount6, String amount7, String amount8, String amount9, String explanation, String imageUrl, String recipeCode){
        this.name = name;
        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.ingredient4 = ingredient4;
        this.ingredient5 = ingredient5;
        this.ingredient6 = ingredient6;
        this.ingredient7 = ingredient7;
        this.ingredient8 = ingredient8;
        this.ingredient9 = ingredient9;
        this.amount1 = amount1;
        this.amount1 = amount2;
        this.amount1 = amount3;
        this.amount1 = amount4;
        this.amount1 = amount5;
        this.amount1 = amount6;
        this.amount1 = amount7;
        this.amount1 = amount8;
        this.amount1 = amount9;
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

    public String getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(String ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public String getIngredient3() {
        return ingredient3;
    }

    public void setIngredient3(String ingredient3) {
        this.ingredient3 = ingredient3;
    }

    public String getIngredient4() {
        return ingredient4;
    }

    public void setIngredient4(String ingredient4) {
        this.ingredient4 = ingredient4;
    }

    public String getIngredient5() {
        return ingredient5;
    }

    public void setIngredient5(String ingredient5) {
        this.ingredient5 = ingredient5;
    }

    public String getIngredient6() {
        return ingredient6;
    }

    public void setIngredient6(String ingredient6) {
        this.ingredient6 = ingredient6;
    }

    public String getIngredient7() {
        return ingredient7;
    }

    public void setIngredient7(String ingredient7) {
        this.ingredient7 = ingredient7;
    }

    public String getIngredient8() {
        return ingredient8;
    }

    public void setIngredient8(String ingredient8) {
        this.ingredient8 = ingredient8;
    }

    public String getIngredient9() {
        return ingredient9;
    }

    public void setIngredient9(String ingredient9) {
        this.ingredient9 = ingredient9;
    }

    public String getAmount2() {
        return amount2;
    }

    public void setAmount2(String amount2) {
        this.amount2 = amount2;
    }

    public String getAmount3() {
        return amount3;
    }

    public void setAmount3(String amount3) {
        this.amount3 = amount3;
    }

    public String getAmount4() {
        return amount4;
    }

    public void setAmount4(String amount4) {
        this.amount4 = amount4;
    }

    public String getAmount5() {
        return amount5;
    }

    public void setAmount5(String amount5) {
        this.amount5 = amount5;
    }

    public String getAmount6() {
        return amount6;
    }

    public void setAmount6(String amount6) {
        this.amount6 = amount6;
    }

    public String getAmount7() {
        return amount7;
    }

    public void setAmount7(String amount7) {
        this.amount7 = amount7;
    }

    public String getAmount8() {
        return amount8;
    }

    public void setAmount8(String amount8) {
        this.amount8 = amount8;
    }

    public String getAmount9() {
        return amount9;
    }

    public void setAmount9(String amount9) {
        this.amount9 = amount9;
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
                ", ingredient1='" + ingredient1 + '\'' +
                ", ingredient2='" + ingredient2 + '\'' +
                ", ingredient3='" + ingredient3 + '\'' +
                ", ingredient4='" + ingredient4 + '\'' +
                ", ingredient5='" + ingredient5 + '\'' +
                ", ingredient6='" + ingredient6 + '\'' +
                ", ingredient7='" + ingredient7 + '\'' +
                ", ingredient8='" + ingredient8 + '\'' +
                ", ingredient9='" + ingredient9 + '\'' +
                ", amount1='" + amount1 + '\'' +
                ", amount2='" + amount2 + '\'' +
                ", amount3='" + amount3 + '\'' +
                ", amount4='" + amount4 + '\'' +
                ", amount5='" + amount5 + '\'' +
                ", amount6='" + amount6 + '\'' +
                ", amount7='" + amount7 + '\'' +
                ", amount8='" + amount8 + '\'' +
                ", amount9='" + amount9 + '\'' +
                ", explanation='" + explanation + '\'' +
                ", imageUrl='" + imageURL + '\'' +
                '}';
    }
}
