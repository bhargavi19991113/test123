package com.sj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCSelectDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/userone","root","Padmavathi@1999");
        Statement stmt=connection.createStatement();
        ResultSet users =stmt.executeQuery("select * from mytable");
        while(users.next()) {
        	System.out.println(users.getInt(1)+" , "+users.getString(2)+" , "+users.getString(3));
        }
        
	}

}
