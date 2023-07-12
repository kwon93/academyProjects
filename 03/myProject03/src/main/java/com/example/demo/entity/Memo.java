package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_memo") // 생략하면 클래스이름이 테이블이름이 됨.
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Memo {
	
	@Id //PK 가 됨. 엔티티클래스라면 반듣시 @Id가 있어야함.
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 키 생성 
	private int no;
	
	@Column(length = 200, nullable = true)
	private String text;
	
	@Column(length = 20, nullable = false)
	private String test;
}
