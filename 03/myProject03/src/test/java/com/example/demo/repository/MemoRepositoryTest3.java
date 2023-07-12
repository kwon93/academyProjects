package com.example.demo.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Memo;

@SpringBootTest
public class MemoRepositoryTest3 {
	
	@Autowired
	MemoRepository3 memoRepository3;
	
	@Test
	void 번호가3보다작은메모검색() {
		//테이블삭제하고 메모 3건 다시추가
		List<Memo> list = memoRepository3.get1(3);
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}
	
	@Test
	void 번호가2와3사이인_메모검색() {
		List<Memo> list = memoRepository3.get3(2,3);
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}
	
	
	@Test
	void 번호를기준으로역정렬한메모검색() {
		List<Memo> list = memoRepository3.get2();
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}
}

