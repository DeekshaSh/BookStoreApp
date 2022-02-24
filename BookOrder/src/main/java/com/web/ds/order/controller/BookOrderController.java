package com.web.ds.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.ds.order.service.BookOrderService;

@RestController
@RequestMapping("/bookorder")
public class BookOrderController {

	@Autowired
	private BookOrderService bookOrderService;


	@RequestMapping(value = "/{id}", method = RequestMethod.POST)
	public void findBookById(@PathVariable String orderId) {
		bookOrderService.findOrderByOrderId(orderId);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteStudent(@PathVariable String orderId) {
		bookOrderService.deleteOrderByOrderId(orderId);
		return "Book has been deleted successfully";
	}
}
