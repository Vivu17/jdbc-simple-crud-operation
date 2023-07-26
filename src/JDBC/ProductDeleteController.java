package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDeleteController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		// TODO Auto-generated method stub
		try {
		// step-1 load register
		Class.forName("com.mysql.cj.jdbc.Driver");
						
		//step-2 Create Connection
		String url ="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
		String user = "root";
		String pass = "Mahadev";
						
		connection= DriverManager.getConnection(url, user, pass);
		
		// setp-3 creta statement
		String deleteColorQuery ="delete from product where productid =?";
		PreparedStatement preparedStatement = connection.prepareStatement(deleteColorQuery);
		preparedStatement.setString(4,"white");
		preparedStatement.setInt(1,100);
		
		int a=preparedStatement.executeUpdate();
		if(a==1)
		{
			System.out.println("Data is Deleted");
		}
		else {
			System.err.println("given id is not present");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


