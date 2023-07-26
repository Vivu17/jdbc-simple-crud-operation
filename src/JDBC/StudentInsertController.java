package JDBC;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	
	public class StudentInsertController {
		
		public static void main(String[] args) {
			Connection connection = null;
			try {
				// step-1 load register
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//step-2 Create Connection
				String url ="jdbc:mysql://localhost:3306/student1";																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																														
				String user = "root";
				String pass = "Mahadev";
				
				connection = DriverManager.getConnection(url, user, pass);
				
				//step-3 create statement
				Statement statement = connection.createStatement();
				
				//step-4 executeQuery
				String insertStudentQuery = "insert into student (id,name,email,phone) values (421,'faizan','faizan@gmail.com',7352091217)";
				statement.execute(insertStudentQuery);
				
				System.out.println("----------------DATA STORED----------------");
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			finally {
				try {
					//step-5 close connection
					connection.close();
					
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}

	}
	
	//CTRL+SHIFT+O== Delete usable import keyword 
	
	