package com.cookbook.recipe.manager.repo;

import java.util.List;
import java.util.UUID;

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
                recipe.setId(UUID.randomUUID().toString());
                final int identifier = (int) getSession().save(recipe);
                if (identifier != 0) {
                    return recipes;
                }

            }
        } catch (final Exception e) {
            throw new PersistenceException("Failed to persist recipes", e);
        }

        return null;
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
