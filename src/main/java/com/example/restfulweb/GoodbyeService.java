package com.example.restfulweb;

import org.springframework.stereotype.Component;

@Component
public class GoodbyeService {
	
	//no fields
	
	//it has an IMPLICIT constructor
	//public GoodbyService(){}
	
	//method
	public String goodbye() {
		
		return "that's all folks";
	}

}
