package spring5.kitchen.Repositories;

import org.springframework.data.repository.CrudRepository;
import spring5.kitchen.domain.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
