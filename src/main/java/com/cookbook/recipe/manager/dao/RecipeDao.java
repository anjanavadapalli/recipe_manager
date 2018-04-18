package com.cookbook.recipe.manager.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cookbook.recipe.manager.model.Recipe;

@Component
public class RecipeDao {

    private static final Map<String, Recipe> RECIPE_REPO = new HashMap<>();

    @Autowired
    private SessionFactory sessionFactory;

    static {
        final Recipe recipe1 = new Recipe(UUID.randomUUID().toString(), "Biryani", 1, 30, "Ask vahchef");
        final Recipe recipe2 = new Recipe(UUID.randomUUID().toString(), "Gutti Vankaya", 1, 30, "Ask Gayatri Vantillu");
        RECIPE_REPO.put(recipe1.getId(), recipe1);
        RECIPE_REPO.put(recipe2.getId(), recipe2);
    }

    public List<Recipe> save(final List<Recipe> recipes) {

        for (final Recipe recipe : recipes) {
            synchronized (this) {

                this.sessionFactory.getCurrentSession().save(recipe);
                // recipe.setId(UUID.randomUUID().toString());
                // RECIPE_REPO.put(recipe.getId(), recipe);
            }

        }
        return recipes;

    }

    public List<Recipe> getAll() {

        final List<Recipe> recipes = this.sessionFactory.getCurrentSession().createQuery("from recipes").list();
        return recipes;
        // return RECIPE_REPO.values().stream().collect(Collectors.toList());
    }
}
