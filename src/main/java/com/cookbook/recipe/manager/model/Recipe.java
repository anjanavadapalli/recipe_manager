package com.cookbook.recipe.manager.model;

public class Recipe {

    private String id;

    private String name;

    private int servings;

    private int prepDurationMins;

    private String directions;

    private String imageId;

    // HashMap<String, Double> ingredients_Quantity = new HashMap<String, Double>();

    public Recipe(final String id, final String name, final int servings, final int prepDurationMins, final String directions) {
        super();
        this.id = id;
        this.name = name;
        this.servings = servings;
        this.prepDurationMins = prepDurationMins;
        this.directions = directions;
    }

    public Recipe() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(final int servings) {
        this.servings = servings;
    }

    public int getPrepDurationMins() {
        return prepDurationMins;
    }

    public void setPrepDurationMins(final int prepDurationMins) {
        this.prepDurationMins = prepDurationMins;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(final String directions) {
        this.directions = directions;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(final String imageId) {
        this.imageId = imageId;
    }
}
