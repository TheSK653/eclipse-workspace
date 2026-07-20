package JDBC;

import java.sql.*;

public class java_databaase_program {
	
	public static void main(String[] args) throws Exception {
		
		// load and register the driver		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		
		Statement st = con.createStatement();
		
		String createQuery =
                "CREATE TABLE Employee(" +
                "EmpID INT, " +
                "EmpName VARCHAR(50), " +
                "EmpSalary INT)";
		
			st.executeUpdate(createQuery);
			
		String insertQuery = "INSERT INTO Employee VALUES(1,'John',50000)";
		
			st.executeUpdate(insertQuery);
			
		System.out.println("Table created and data inserted!");
		
		con.close();
			
	}
}