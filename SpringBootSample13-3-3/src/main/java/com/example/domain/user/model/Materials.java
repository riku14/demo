package com.example.domain.user.model;

import java.util.Date;

import lombok.Data;

@Data
public class Materials {
	private String materialsId;
	private String materialsName;
	private Integer kosuu;
	private Integer zaiko;
	private Integer price;
	private Date order;

}
