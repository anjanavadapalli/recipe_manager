package com.cookbook.recipe.manager.resource;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cookbook.recipe.exception.PersistenceException;
import com.cookbook.recipe.exception.ValidationException;
import com.cookbook.recipe.manager.model.Recipe;
import com.cookbook.recipe.manager.service.IRecipeService;

@RestController
@RequestMapping("/Recipe")
public class RecipeResource {

    @Autowired
    private IRecipeService recipeService;

    @RequestMapping(value = "/create", method = RequestMethod.POST,
            consumes = APPLICATION_JSON_UTF8_VALUE,
            produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public List<Recipe> createRecipe(@RequestBody final List<Recipe> recipeRequest) throws ValidationException, PersistenceException {

        return recipeService.createRecipe(recipeRequest);

    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = APPLICATION_JSON_UTF8_VALUE)
    public List<Recipe> getAllRecipes() throws PersistenceException {
        return recipeService.getAllRecipes();

    }
}
