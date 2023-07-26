package JDBC;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;
	
	public class NewInsertData {
		
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter student id to update name");
			int id=scanner.nextInt();
			System.out.println("Enter new name to update name");
			String email = scanner.next();
			try {
				// step-1 load register
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				//step-2 Create Connection
				String url ="jdbc:mysql://localhost:3306/student1";
				String user = "root";
				String pass = "Mahadev";
				
				Connection connection = DriverManager.getConnection(url, user, pass);
				
				//step-3 create statement
				Statement statement = connection.createStatement();
				
				//step-4 executeQuery
				String updatestudent1emailQuery = "update student set email='"+email+"'WHERE id ="+id;
				int a=statement.executeUpdate(updatestudent1emailQuery);
				
				if(a==1)
				{
					System.out.println("data is inserted");
				}
				else {
					System.out.println("id is wrong");
				}
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			}
		}

