package JDBC;

import java.sql.*;

public class JavaDatabaseOpeartion {
	
	public static void main(String[] args) throws Exception {
		
		// load and register the driver		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		
		Statement st = con.createStatement();
		
//		String createQuery =
//                "CREATE TABLE Employee(" +
//                "EmpID INT, " +
//                "EmpName VARCHAR(50), " +
//                "EmpSalary INT)";
//		
//			st.executeUpdate(createQuery);
			
		// Query to insert data into the table
//		String insertQuery = "INSERT INTO Employee VALUES(1,'John',50000), (2,'Jane',60000), (3,'Doe',55000)";
//		st.executeUpdate(insertQuery);
		
		//System.out.println("Table created and data inserted!");

		// Query to update data in the table
//		String updateQuery = "UPDATE Employee SET EmpSalary = 70000 WHERE EmpID = 1";
//		st.executeUpdate(updateQuery);
		
		// Query to count the how many data is inserted in table
//		String query = "insert into Employee values(2,'Smith',65000)";
//		int count = st.executeUpdate(query);
//		System.out.println(count);
		
		// Query to delete data from the table
//		String deleteQuery = "DELETE FROM Employee WHERE EmpID = 2";
//		st.executeUpdate(deleteQuery);
		
		// it gives false if we use insert, update, delete query(Deselect query)
//		String query = "insert into employee values(4,'Smith',65000)";
//		boolean result = st.execute(query);
//		System.out.println(result);
		
		//it gives true if we use select query
//		String query = "select * from employee";
//		boolean result = st.execute(query);
//		System.out.println(result);
		
		con.close();
			
	}
}