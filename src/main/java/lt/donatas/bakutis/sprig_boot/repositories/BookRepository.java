package lt.donatas.bakutis.sprig_boot.repositories;

import lt.donatas.bakutis.sprig_boot.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
