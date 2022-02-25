package com.web.ds.order.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.web.ds.order.domain.BookOrder;

@Repository
public interface BookOrderRepository extends CrudRepository<BookOrder, String> {
	
	//@Query("SELECT order FROM BookOrder order WHERE order.orderId =:orderId")
	List<BookOrder> findByOrderId(@Param("orderId") String orderId);
	
}
