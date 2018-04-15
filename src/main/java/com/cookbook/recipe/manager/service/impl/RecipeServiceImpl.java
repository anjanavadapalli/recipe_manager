package com.cookbook.recipe.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cookbook.recipe.manager.dao.RecipeDao;
import com.cookbook.recipe.manager.model.Recipe;
import com.cookbook.recipe.manager.service.IRecipeService;

@Component
public class RecipeServiceImpl implements IRecipeService {

    @Autowired
    private RecipeDao recipeDao;

    @Override
    public List<Recipe> createRecipe(final List<Recipe> recipes) {

        return recipeDao.save(recipes);
    }

    @Override
    public List<Recipe> getAllRecipes() {

        return recipeDao.getAll();
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
