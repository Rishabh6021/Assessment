package com.training.models;

import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
	
	
	
	private String name;
	private String city;
	private String email;
	private long contact;
	@NumberFormat(style=Style.NUMBER)
	@Range(max=999999,min=100000,message="Zip code should be 6 digit")
	private long zipcode;
	

}
