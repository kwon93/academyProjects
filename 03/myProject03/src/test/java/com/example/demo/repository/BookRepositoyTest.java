package com.example.demo.repository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Book;

@SpringBootTest
public class BookRepositoyTest {

	@Autowired
	BookRepository bookRepository;
	
	@Test
	void 게시물등록() {
		Book book1 = new Book(1,20000,"한빛출판사","자바프로그래밍입문");
		Book book2 = new Book(2,20000,"남가람북스","스프링부트프로젝트");
		Book book3 = new Book(3,20000,"이지스퍼블리싱","알고리즘코딩테스트");
		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);
	}
	
	@Test
	void 게시물수정() {
		Optional<Book> result = bookRepository.findById(2);
		Book book = result.get();
		book.setPublisher("수정된 출판사명");
		bookRepository.save(book);
	}
	
	@Test
	void 게시물삭제() {
		bookRepository.deleteById(1);
	}
	
	
}
