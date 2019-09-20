package spring5.kitchen.Repositories;

import org.springframework.data.repository.CrudRepository;
import spring5.kitchen.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
