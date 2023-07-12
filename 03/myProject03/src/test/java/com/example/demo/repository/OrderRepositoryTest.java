package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Order;

@SpringBootTest
public class OrderRepositoryTest {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Test
	void 게시물등록() {
		 Order order1 = new Order(1, "둘리", null, "인천 구월동");
		 Order order2 = new Order(2, "또치", null, "부산 동래동");
		 
		 orderRepository.save(order1);
		 orderRepository.save(order2);
	}
	
	@Test
	void 게시물수정() {
		Optional<Order> result = orderRepository.findById(2);
		Order order = result.get();
		order.setCustomer_name("고길동");
		orderRepository.save(order);
	}
	
	@Test
	void 게시물삭제() {
		Optional<Order> result = orderRepository.findById(1);
		if(result.isPresent()) {
			orderRepository.deleteById(1);
		}
	}
	
	@Test
	void 게시물조회() {
		List<Order> list = orderRepository.findAll();
		for (Order order : list) {
			System.out.println(order);
		}	
	}
}
