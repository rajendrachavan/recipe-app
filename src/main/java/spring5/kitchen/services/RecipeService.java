package spring5.kitchen.services;

import spring5.kitchen.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
