package com.web.ds.order.repository;

import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.ds.order.domain.BookOrder;

@Repository
public interface BookOrderRepository extends CrudRepository<BookOrder, String> {
	
	@Query("SELECT order FROM book_order order WHERE order.id = ?1")
	Map<String, BookOrder> findBookById(String orderId);
	
}
