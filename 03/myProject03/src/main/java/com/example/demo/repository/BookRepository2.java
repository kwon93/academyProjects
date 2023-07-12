package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Book;
import com.example.demo.entity.Memo;

public interface BookRepository2 extends JpaRepository<Book, Integer> {

	
	@Query("select * from Book b where b.title != :title")
	List<Memo> get1(@Param("title") String title);
	
	@Query("select * from Book b where b.price > 20000 and b.publisher = :publ")
	List<Memo> get2(@Param("publ") String publ);
	
	@Query("select * from Book b where b.publisher IN(:publ1 , :publ2)")
	List<Memo> get3(@Param("publ1") String publ1, @Param("publ2") String publ2);
	
}
