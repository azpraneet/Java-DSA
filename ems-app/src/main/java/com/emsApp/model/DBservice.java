package com.emsApp.model;

public interface DBservice {
	public void conectDB();
	public boolean verifylogin(String email, String password);
}
