package spring.service;



import java.util.List;
import spring.model.book;

public interface BookService {

   long save(book book);
   book get(long id);
   List<book> list();
   void update(long id, book book);
   void delete(long id);
}
