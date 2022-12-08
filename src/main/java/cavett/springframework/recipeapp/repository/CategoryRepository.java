package cavett.springframework.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;

import cavett.springframework.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{
    
}
