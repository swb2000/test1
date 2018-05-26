package com.qykj;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test1 {
	public static void main(String args[]) throws ParseException, JsonProcessingException {
		 
		User user = new User();
		user.setName("hello,word4!");
		user.setEmail("abcd@163.com");
		user.setAge(20);

		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
		user.setBirthday(dateformat.parse("2018-10-01"));
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writeValueAsString(user);
		System.out.println(json);
		System.out.println("end446");
	}
}
