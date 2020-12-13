package com.example.springbootdemo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 

public class Contoller {
	
	@RequestMapping(value="/Hello")
	
	public String Hello()
	{
		return "Hello team";
	}
	

}
