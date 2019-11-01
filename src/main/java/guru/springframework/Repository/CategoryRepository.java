package guru.springframework.Repository;

import guru.springframework.Domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {

}
