package com.java.learning.day11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbcExample {
	//after program coding rightclick   on      i.e Corejavalearning  properties libraries  add external jar select from mysql indesktop click ok

	public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		statement=connection.createStatement();
	String sql="insert into pioneer_student values('srav','albany','12203')";
		statement.execute(sql);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();

	}finally{
		try{
		
		if(statement != null){
		
				statement.close();			
		}
		if(connection !=null)
		{	connection.close();
				}
		}
				
			
		catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	
	

	}

}
