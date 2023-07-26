package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Connection connection =null;
		try {
			// step-1 load register
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step-2 Create Connection
			String url ="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
			String user = "root";
			String pass = "Mahadev";
			
			connection = DriverManager.getConnection(url, user, pass);
			String insertQuery ="insert into product value(?,?,?,?)";
			//step-3 create statement
			PreparedStatement preparedStatement= connection.prepareStatement(insertQuery);
			
			preparedStatement.setInt(1,100);
			preparedStatement.setString(2,"pen");
			preparedStatement.setDouble(3,333.33);
			preparedStatement.setString(4,"Black");
			//step-4 executeQuery
			preparedStatement.execute();
			
			System.out.println("data is inserted");
			
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
		}
	}

