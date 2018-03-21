package org.itstep.service.impl;

import org.itstep.service.SpringTestService;
import org.springframework.stereotype.Service;

@Service
public class SpringTestServiceImpl implements SpringTestService{

	public String postMethod() {
		return "This is POST method call!";
	}

	public String getMethod() {
		return "This is GET method call!";
	}

	public String putMethod() {
		return "This is PUT method call!";
	}

	public String deleteMethod() {
		return "This is DELETE method call!";
	}

}
