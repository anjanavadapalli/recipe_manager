package com.cookbook.recipe.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cookbook.recipe.exception.PersistenceException;
import com.cookbook.recipe.exception.ValidationException;
import com.cookbook.recipe.manager.model.Recipe;
import com.cookbook.recipe.manager.repo.IRecipeRepo;
import com.cookbook.recipe.manager.service.IRecipeService;

@Component
public class RecipeServiceImpl implements IRecipeService {

    @Autowired
    private IRecipeRepo recipeRepo;

    @Override
    public List<Recipe> createRecipe(final List<Recipe> recipes) throws ValidationException, PersistenceException {

        return recipeRepo.save(recipes);
    }

    @Override
    public List<Recipe> getAllRecipes() throws PersistenceException {

        return recipeRepo.getAll();
    }

    @Override
    public boolean deleteRecipe(final String id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Recipe getRecipe(final String id) {
        // TODO Auto-generated method stub
        return null;
    }

}
