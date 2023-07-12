package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Memo;

public interface MemoRepository3 {
	
	//JPQL 사용하기
	@Query("select m from Memo m where m.no < :mno")
	List<Memo> get1(@Param("mno") int mno);
	
	@Query("select m from Memo m where m.text is not null")
	List<Memo> get2();
	
	@Query("select m from Memo m where m.no between :from and :to")
	List<Memo> get3(@Param("from") int from, @Param("to") int to);
	
	@Query(value = " select * from tbl_memo order by no desc", nativeQuery = true)
	List<Memo> get4();
}
