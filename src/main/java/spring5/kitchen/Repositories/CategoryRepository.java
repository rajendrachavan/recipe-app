package spring5.kitchen.Repositories;

import org.springframework.data.repository.CrudRepository;
import spring5.kitchen.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
