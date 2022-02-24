package com.web.ds.catalog.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.web.ds.catalog.domain.BookDetails;
import com.web.ds.catalog.repository.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class BookCatalogServiceImpl implements BookCatalogService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void getBookId(BookDetails bookDetails) {

		Optional<BookDetails> getBookID = bookRepository.findById(bookDetails.getBookId());
		
		if(getBookID.isPresent()){
			bookDetails.setAvailable(true);
		}

		bookRepository.save(bookDetails);

		log.info("book is available in the shop", bookDetails.getBookId());
	}

	@Override
	public Map<String, BookDetails> findBookById(String bookId) {
		
		Map<String, BookDetails> bookDetailsMap = (Map<String, BookDetails>) bookRepository.findBookById(bookId);
		
		return bookDetailsMap;
	}

	@Override
	public Boolean deleteBookById(String bookId) {

		bookRepository.deleteById(bookId);
		return true;
	}
}
