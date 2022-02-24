package com.web.ds.catalog.service;

import java.util.Map;

import com.web.ds.catalog.domain.BookDetails;

public interface BookCatalogService {

	void getBookId(BookDetails bookDetails);
	
	Map<String, BookDetails> findBookById(String bookId); 
	
	Boolean deleteBookById(String bookId);
}
