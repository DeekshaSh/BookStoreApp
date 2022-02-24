package com.web.ds.order.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.web.ds.order.domain.BookOrder;
import com.web.ds.order.repository.BookOrderRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class BookOrderServiceImpl implements BookOrderService {

	private final Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	BookOrderRepository orderRepository;

	@Override
	public void findOrderByOrderId(String orderId) {

		Optional<BookOrder> getorderDetails = orderRepository.findById(orderId);

		if (getorderDetails.isPresent()) {
			log.info("order is successfull", orderId);
		}
	}

	@Override
	public Boolean deleteOrderByOrderId(String orderId) {
		orderRepository.deleteById(orderId);
		return true;
	}

}
