package com.cookbook.recipe.manager.service;

import java.util.List;

import com.cookbook.recipe.exception.ValidationException;
import com.cookbook.recipe.manager.model.Recipe;

public interface IRecipeService {

    List<Recipe> createRecipe(final List<Recipe> recipe) throws ValidationException;

    boolean deleteRecipe(final String id);

    Recipe getRecipe(final String id);

    List<Recipe> getAllRecipes();
}
