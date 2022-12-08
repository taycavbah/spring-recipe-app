package cavett.springframework.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;

import cavett.springframework.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    
}
