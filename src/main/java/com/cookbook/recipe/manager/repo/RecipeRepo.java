package com.cookbook.recipe.manager.repo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cookbook.recipe.exception.PersistenceException;
import com.cookbook.recipe.manager.model.Recipe;

@Repository
@Transactional
public class RecipeRepo extends AbstractRepo implements IRecipeRepo {

    @Autowired
    public RecipeRepo(@Qualifier("recipeManagerSessionFactory") final SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    @Override
    public List<Recipe> save(final List<Recipe> recipes) throws PersistenceException {

        // final List<Recipe> persistedRecipes = new ArrayList<>();
        try {
            for (final Recipe recipe : recipes) {

                getSession().save(recipe);
                // System.out.println(identifier);
                // persistedRecipes.add(persistedRecipe);
                // recipe.setId(UUID.randomUUID().toString());
                // RECIPE_REPO.put(recipe.getId(), recipe);

            }
        } catch (final Exception e) {
            throw new PersistenceException("Failed to persist recipes", e);
        }
        return recipes;

    }

    @Override
    public List<Recipe> getAll() throws PersistenceException {
        try {

            @SuppressWarnings("unchecked")
            final Query<Recipe> query = getSession().createQuery("from Recipe");
            return query.list();
        } catch (final Exception e) {
            throw new PersistenceException("Failed to get recipes", e);
        }

        // return RECIPE_REPO.values().stream().collect(Collectors.toList());
    }
}
