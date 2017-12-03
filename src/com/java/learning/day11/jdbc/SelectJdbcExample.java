package com.java.learning.day11.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class SelectJdbcExample {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			statement=connection.createStatement();
		 String sql="select name,state,zip from pioneer_student";
		 ResultSet rs=statement.executeQuery(sql);
		 while(rs.next());
		 {
		System.out.println("values are:" +rs.getString(1)  +"  "+rs.getString(2)   +""+rs.getInt(3));	 
		 }
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


