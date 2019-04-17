package spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.dao.BookDao;
import spring.model.book;



@Service
@Transactional(readOnly = true)
public  class BookServiceimp implements BookService {
	
	@Autowired
	   private BookDao bookDao;
  

	@Transactional
	   @Override
	   public long save(book book) {
	      return bookDao.save(book);
	   }

	   @Override
	   public book get(long id) {
	      return bookDao.get(id);
	   }

	   @Override
	   public List<book> list() {
	      return bookDao.list();
	   }

	   @Transactional
	   @Override
	   public void update(long id, book book) {
	      bookDao.update(id, book);
	   }

	   @Transactional
	   @Override
	   public void delete(long id) {
	      bookDao.delete(id);
	   }

	}