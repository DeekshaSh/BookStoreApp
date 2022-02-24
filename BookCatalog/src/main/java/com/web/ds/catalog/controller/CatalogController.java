package com.web.ds.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.ds.catalog.service.BookCatalogService;

@RestController
@RequestMapping("/bookcatalog")
public class CatalogController {

	@Autowired
	private BookCatalogService bookcatalogService;


	@RequestMapping(method = RequestMethod.POST)
	public void findBookById(@RequestBody String bookId) {
		bookcatalogService.findBookById(bookId);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String deleteStudent(@PathVariable String id) {
		bookcatalogService.deleteBookById(id);
		return "Book has been deleted successfully";
	}
}
