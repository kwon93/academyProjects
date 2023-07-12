package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Memo;

import jakarta.transaction.Transactional;


@Transactional
public interface MemoRepository2 extends JpaRepository<Memo, Integer> {
	
	//메모객체의 no값이 3보다 작은 객체 구함
	List<Memo> findByNoLessThan(int mno);
	
	//메모 객체의 text값이 빈값이 객체 구함
	List<Memo> findByTextIsNotNull();
	
	//메모객체의 no값이 2에서3 사이인 객체구함
	List<Memo> findByNoBetween(int from, int to);
	
	//메모 객체를 no를 기준으로 역정렬함
	List<Memo> findByOrderByNoDesc();
	
	//메모 객체의 no값이 3보다 작은 객체 삭제
	void deleteMemoByNoLessThan(int mno);
	
}
