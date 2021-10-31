package com.se3.cookingmanager.service;

import com.se3.cookingmanager.exception.RecipeNotFoundException;
import com.se3.cookingmanager.model.Recipe;
import com.se3.cookingmanager.repo.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RecipeService {
    long newID = 4;

    private final RecipeRepo recipeRepo;

    @Autowired
    public RecipeService(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    public Recipe addRecipe(Recipe recipe){
        recipe.setId(newID++);
        recipe.setRecipeCode(UUID.randomUUID().toString());
        return recipeRepo.save(recipe);
    }

    public List<Recipe> findAllRecipes(){
        return recipeRepo.findAll();
    }

    public Recipe updateRecipe(Recipe recipe){
        return recipeRepo.save(recipe);
    }

    public Recipe findRecipeById(Long id){
        return recipeRepo.findRecipeById(id).orElseThrow(() -> new RecipeNotFoundException("Recipe by id " + id + " was not found!"));
    }

    public void deleteRecipe(Long id){
        recipeRepo.deleteRecipeById(id);
    }
}
