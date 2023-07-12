package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_gift")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gift {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int no;
	
	@Column(length = 20, nullable = true)
	private String name;
	
	@Column(length = 11, nullable = true)
	private int price;
	
	@Column(length = 20, nullable = true)
	private String type;
	
	
	
	
	
}
