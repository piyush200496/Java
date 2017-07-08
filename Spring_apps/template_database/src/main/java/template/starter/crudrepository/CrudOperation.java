package template.starter.crudrepository;
import org.springframework.data.repository.CrudRepository;

import template.starter.domain.EmployeeEntity;


public interface CrudOperation extends CrudRepository<EmployeeEntity, Long> {

}
