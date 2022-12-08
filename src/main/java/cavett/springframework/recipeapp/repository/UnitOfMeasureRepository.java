package cavett.springframework.recipeapp.repository;

import org.springframework.data.repository.CrudRepository;

import cavett.springframework.recipeapp.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    
}
