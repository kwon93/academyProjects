package com.example.demo.repository;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Book;

@SpringBootTest
public class BookRepositryTest2 {

	@Autowired
	BookRepository2 bookRepository2;
	
	@Autowired
	Book book;
	
	@Test
	@DisplayName("자바프로그래밍입문이 아닌책 검색")
	void titleSearch() {
		List<Book> list = bookRepository2.get1("자바프로그래밍입문");
	
		
	}
}
