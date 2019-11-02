package guru.springframework.Service;

import guru.springframework.Domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
