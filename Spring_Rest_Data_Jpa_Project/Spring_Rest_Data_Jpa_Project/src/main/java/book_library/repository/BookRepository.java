package book_library.repository;
import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import book_library.entity.Book;

/*@Repository is not required because JpaRepository is already 
 * managed by spring*/

@Repository // Marks this class as a repository and it  is managed by spring
public interface BookRepository extends JpaRepository<Book,Integer>{}