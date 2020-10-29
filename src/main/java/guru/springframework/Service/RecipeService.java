package guru.springframework.Service;

import guru.springframework.Domain.Recipe;
import guru.springframework.commands.RecipeCommand;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);

    void deleteById(Long idToDelete);
}
