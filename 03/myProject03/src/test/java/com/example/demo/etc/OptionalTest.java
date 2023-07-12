package com.example.demo.etc;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * Optional 객체를 감싸는 wrapper class 
 * */

@SpringBootTest
public class OptionalTest {

	@Test
	void Optional() {
		java.util.Optional<Object> opt = java.util.Optional.of("apple");
		System.out.println(opt.get()); // 값꺼내기
		System.out.println(opt.isEmpty()); // 값이 비어있는가?
		System.out.println(opt.isPresent()); //값이 들어가있는가?
		System.out.println(opt.orElse("banana")); //값이 없다면 대체할 데이터값
		
	}
	
	@Test
	void of와nullable의차이() {
		String str = null;
//		Optional<String> opt1 = Optional.of(str); //null값 받으면 에러남.
		Optional<String> opt2 = Optional.ofNullable(str); //null값을 받을 수 있음.
	}
	
	@Test
	void if를사용하여null값체크하기() {
		String str = "banana";
		if(str != null) {
			System.out.println("값이 존재합니다.");
		}
	}
	
	@Test
	@DisplayName("옵셔널사용하여 널값 체크하기")
	void optionalNullCheck() {
		String str = "banana";
		Optional<String> opt = Optional.ofNullable(str);
		opt.ifPresent(name -> System.out.println("값이 존재합니다."));
		
		//위 if null 체크방식으로 더 간결하게 체크할 수 있다.
	}
	
}
