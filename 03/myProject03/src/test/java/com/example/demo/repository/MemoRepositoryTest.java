package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Memo;

@SpringBootTest
public class MemoRepositoryTest {
	
	@Autowired
	MemoRepository memoRepository;
	
	@Test
	@DisplayName("리파지토리 인스턴스를 가져왔는지 확인하기")
	void repositoryInstanceCheck() {
		System.out.println("memoRepository 확인 : "+memoRepository);

	}

	
	@Test
	void 데이터등록() {
		Memo memo1 = new Memo(0, "새 글입니다.","test");
		memoRepository.save(memo1);
		Memo memo2 = new Memo(0, "새 글입니다.","test");
		memoRepository.save(memo2);
		
	}
	
	@Test 
	void 데이터단건조회() {
		Optional<Memo> result = memoRepository.findById(1);
		if(result.isPresent()) {
			Memo memo = result.get();
			System.out.println(memo);
		}
	}
	
	@Test
	void 데이터전체조회() {
		List<Memo> list = memoRepository.findAll();
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}
	
	@Test
	void 데이터수정() {
		Memo memo = new Memo(4,"글이 수정되었습니다.","test123");
		memoRepository.save(memo);
	}
	
	@Test 
	void 데이터삭제() {
		memoRepository.deleteById(1); // 해당 엔티티가 존재하지 않을시 에러가 발생한다.
	}
	
	@Test
	void 데이터전체삭제()	{
		memoRepository.deleteAll();
	}
}
