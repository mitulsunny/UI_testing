package com.osa.jira;
import sun.misc.BASE64Encoder;
import java.io.FileInputStream;
import java.io.InputStream;

import com.google.common.net.HttpHeaders;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Jira {

	
	public static void main(String[] args) {
		try {
		InputStream inputCucumberJson=new FileInputStream("target/cucumber-reports/report.json");
		String auth="mitulsunny:01723Sunny@";
		BASE64Encoder encoder = new BASE64Encoder();
	    String encodedAuth=encoder.encode((auth).getBytes("UTF-8"));
	    String baseURI="http://www.atlassian.com";
	    String endPoint="/rest/raven/1.0/import/execution/cucumber";
	  
	    RestAssured.baseURI=baseURI;
			Response response= RestAssured.given().
		    		contentType("application/json").
		    		headers(HttpHeaders.AUTHORIZATION,"Basic "+encodedAuth).
		    		body(inputCucumberJson).
		    		when().
		    		post(endPoint);
			
			String jsonResponst=response.getBody().asString();
			System.out.println(jsonResponst);
	   
		}catch(Exception e){}
	}


	
}
