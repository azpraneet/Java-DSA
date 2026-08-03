package com.emsApp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBserviceImpl implements DBservice {
	private Statement stmnt;
	private Connection con;
	@Override
	public void conectDB() {
		  try {
	            
	            Class.forName("com.mysql.cj.jdbc.Driver");    
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emsdb", "root", "12345");

	            stmnt=con.createStatement();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

	@Override
	public boolean verifylogin(String email, String password) {
		try (
			ResultSet result = stmnt.executeQuery("select * from users where email='"+email+"'and password='"+password+"'")) {
			return result.next();
			} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
