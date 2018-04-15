package com.cookbook.recipe.manager.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.cookbook.recipe.manager.model.Recipe;

@Component
public class RecipeDao {

    private static final Map<String, Recipe> RECIPE_REPO = new HashMap<>();

    static {
        final Recipe recipe1 = new Recipe(UUID.randomUUID().toString(), "Biryani", 1, 30, "Ask vahchef");
        final Recipe recipe2 = new Recipe(UUID.randomUUID().toString(), "Gutti Vankaya", 1, 30, "Ask Gayatri Vantillu");
        RECIPE_REPO.put(recipe1.getId(), recipe1);
        RECIPE_REPO.put(recipe2.getId(), recipe2);
    }

    public List<Recipe> save(final List<Recipe> recipes) {

        for (final Recipe recipe : recipes) {
            synchronized (this) {
                recipe.setId(UUID.randomUUID().toString());
                RECIPE_REPO.put(recipe.getId(), recipe);
            }

        }
        return recipes;

    }

    public List<Recipe> getAll() {
        return RECIPE_REPO.values().stream().collect(Collectors.toList());
    }
}
