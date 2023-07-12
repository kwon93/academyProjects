package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Board;

@SpringBootTest
public class BoardRepositoryTest {

	@Autowired
	BoardRepository boardRepository;
	
	@Test
	void repositoryInstanceCheck() {
		System.out.println(boardRepository+" 입니다.");
	}
	
	@Test
	void 게시물등록() {
		Board board1 = new Board();
		board1.setTitle("제목입니다.");
		board1.setContent("내용입니다~~~");
		boardRepository.save(board1);
		Board board2 = new Board(0,"2번글","내용입니다.",null,null);
		boardRepository.save(board2);
	}
	
	@Test
	void 게시물조회() {
		 Optional<Board> result = boardRepository.findById(1);
		 if(result.isPresent()) {
			 Board board = result.get();
			 System.out.println(board);
		 }
	}
	
	@Test
	void 게시물전체조회() {
		List<Board> result = boardRepository.findAll();
		for (Board board : result) {
			System.out.println(board);
		}
	}
	
	@Test
	void 게시물수정() {
		Optional<Board> result = boardRepository.findById(15);
		Board board = result.get();
		board.setContent("내용만 수정이 되었습니다~~~~~~");
		boardRepository.save(board);
	}
	
	@Test
	void 게시물삭제() {
		boardRepository.deleteById(1);
	}
	
	@Test
	void 게시물전체삭제() {
		boardRepository.deleteAll();
	}
}
