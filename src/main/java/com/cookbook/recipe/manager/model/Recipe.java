package com.cookbook.recipe.manager.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class Recipe implements Serializable {

    private static final long serialVersionUID = 164805050912765327L;

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "servings", nullable = false)
    private int servings;

    @Column(name = "prep_duration", nullable = false)
    private int prepDurationMins;

    @Column(name = "directions", nullable = false)
    private String directions;

    @Column(name = "image_url", nullable = false)
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
