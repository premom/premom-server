package com.petifee.controller;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class MySQLConnTest {
	private static final String Driver = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/PreMom?useSSL=false&serverTimezone=Asia/Seoul";
	private static final String User = "premom";
	private static final String Pass = "asdf7070!";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(Driver); //드라이버 지정 클래스 로딩
		try (Connection con = DriverManager.getConnection(URL, User, Pass)){
			System.out.println(con);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
