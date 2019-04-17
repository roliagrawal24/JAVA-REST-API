package spring.dao;



import java.util.List;
import spring.model.book;

public interface BookDao {

   long save(book book);
   book get(long id);
   List<book> list();
   void update(long id, book book);
   void delete(long id);

}
