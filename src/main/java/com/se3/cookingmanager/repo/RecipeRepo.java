package com.se3.cookingmanager.repo;

import com.se3.cookingmanager.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RecipeRepo extends JpaRepository<Recipe, Long> {

    void deleteRecipeById(Long id);

    Optional<Recipe> findRecipeById(Long id);
}
