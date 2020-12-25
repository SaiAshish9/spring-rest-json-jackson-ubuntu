package com.jacksondemo.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			
			ObjectMapper mapper = new ObjectMapper();
			
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			for(String x:theStudent.getLanguages()) {
				System.out.println(x);
			}
			
			System.out.println(theStudent.getFirstName());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
