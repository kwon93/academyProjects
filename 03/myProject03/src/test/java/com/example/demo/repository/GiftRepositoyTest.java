package com.example.demo.repository;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Gift;

@SpringBootTest
public class GiftRepositoyTest {

	@Autowired
	GiftRepository giftRepository;
	
	@Test
	void 게시물등록() {
		Gift[] gifts = new Gift[7];
		
		gifts[0] = new Gift(1, "참치세트", 10000, "식품");
		gifts[1] = new Gift(2, "햄세트", 20000, "식품");
		gifts[2] = new Gift(3, "샴푸세트", 30000, "생활용품");
		gifts[3] = new Gift(4, "세차세트", 40000, "생활용품");
		gifts[4] = new Gift(5, "주방세트", 50000, "생활용품");
		gifts[5] = new Gift(6, "노트북", 60000, "가전제품");
		gifts[6] = new Gift(7, "벽걸이TV", 70000, "가전제품");
		
		for (int i = 0; i < 7; i++) {
			giftRepository.save(gifts[i]);
		}
	}
	
	
	@Test
	void 게시물수정() {
		Optional<Gift> result = giftRepository.findById(6);
		Gift gift = result.get();
		gift.setName("맥북 프로 14인치");
		giftRepository.save(gift);
	}
	
	@Test
	void 게시물전체삭제() {
		giftRepository.deleteAll();
	}
}
