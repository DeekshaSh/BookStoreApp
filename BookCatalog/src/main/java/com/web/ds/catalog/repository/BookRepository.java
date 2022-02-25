package com.web.ds.catalog.repository;

import com.web.ds.catalog.domain.BookDetails;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookDetails, String> {
	
	//@Query("SELECT book FROM book_details book WHERE book.bookId = ?1")
	BookDetails findBookBybookId(String bookId);
	
}
