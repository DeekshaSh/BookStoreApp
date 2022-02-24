package com.web.ds.order.service;

import java.util.Map;

public interface BookOrderService {

	
	  void findOrderByOrderId(String orderId);
	  	  
	  Boolean deleteOrderByOrderId(String orderId);
	 
}
