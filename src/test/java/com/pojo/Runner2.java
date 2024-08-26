package com.pojo;

import com.google.gson.Gson;



public class Runner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: Creation of java Object//

		Data mydata=new Data("eydsghghjkuiyh");
		LoginResponse loginResponse=new LoginResponse("Sucess", mydata);
		LoginRequestPOJO loginRequestPOJO=new LoginRequestPOJO("YFGFsd", "ssdd");
		
		Gson gson=new Gson();
		String data=gson.toJson(loginRequestPOJO);

		System.out.println(data);

	}

}
