package com.arnab.spring.mail.properties;

public class DBConfiguration {
    private String driver;
    private String url;
    private String user;
    private String pass;
    
    public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void getDBConfiguration(){
        System.out.println("Driver: " +driver);
        System.out.println("url: " +url);
        System.out.println("user: " +user);
        System.out.println("pass: " +pass);
    }
}