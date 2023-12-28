package com.techm.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		FileInputStream  fis = new FileInputStream("E:\\techm-dec-8-2023\\corejava\\src\\db1.properties");
		
		Properties properties = new Properties();
		
		
		properties.load(fis);
		
		String driver= properties.getProperty("jdbc.driver");
		String url = properties.getProperty("jdbc.url");
		String username = properties.getProperty("jdbc.username");
		String password= properties.getProperty("jdbc.password");
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		
		System.out.println("Got the connection ");
		
		Statement st = con.createStatement();
		
		int x = st.executeUpdate("insert into student values(500,'rama')");
		System.out.println(x + "row(s) inserted");
		//close the connection 
		con.close();
		
		
	}

}
