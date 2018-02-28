package lt.donatas.bakutis.sprig_boot.repositories;

import lt.donatas.bakutis.sprig_boot.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
