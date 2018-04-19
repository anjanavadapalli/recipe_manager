package com.cookbook.recipe.manager.repo;

import java.util.List;

import com.cookbook.recipe.exception.PersistenceException;
import com.cookbook.recipe.manager.model.Recipe;

public interface IRecipeRepo {

    List<Recipe> save(final List<Recipe> recipes) throws PersistenceException;

    List<Recipe> getAll() throws PersistenceException;
}
