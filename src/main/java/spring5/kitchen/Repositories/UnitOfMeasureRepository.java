package spring5.kitchen.Repositories;

import org.springframework.data.repository.CrudRepository;
import spring5.kitchen.domain.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
