package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class ProductUpdateCotroller {

	public static void main(String[] args) {
		Connection connection = null;
		// TODO Auto-generated method 
		try {
		// step-1 load register
		Class.forName("com.mysql.cj.jdbc.Driver");
						
		//step-2 Create Connection
		String url ="jdbc:mysql://localhost:3306/jdbc_preparedstatement";
		String user = "root";
		String pass = "Mahadev";
						
		connection= DriverManager.getConnection(url, user, pass);
		
		// step-3 create statement
		String updateColorQuery ="update product set color =? where productid =?";
		PreparedStatement preparedStatement = connection.prepareStatement(updateColorQuery);
		preparedStatement.setString(1,"white");
		preparedStatement.setInt(2,100);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
