package com.tusheng.lesson10;
import java.sql.*;

public class HelloMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String driver = "com.mysql.jdbc.Driver";
		 String url = "jdbc:mysql://127.0.0.1:3306/zhutao";
		 String user = "root";
		 String password = "java";
		 url = url + "?user=" + user + "&password=" + password; 
		 try{
			 Class.forName(driver).newInstance();
			 Connection conn = DriverManager.getConnection(url);
			 if (!conn.isClosed()){
				 System.out.println("Successfully connected to db");
				 Statement st = conn.createStatement();
				 String sql = "select * from person";
				 ResultSet rs = st.executeQuery(sql);
				 while(rs.next()){
					 System.out.println(rs.getString("ID"));
					 System.out.println(rs.getString("name"));
					 System.out.println(rs.getString("gender"));
					 System.out.println(rs.getString("age"));
				 }
			 }
			 conn.close();
		 }
		 catch(Exception e){
			 System.out.println(e);
		 }
		 finally{
			 
		 }
	}

}
