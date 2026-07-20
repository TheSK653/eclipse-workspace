package JDBC;

import java.sql.*;

public class batchUpdation {
	public static void main(String[] args) throws Exception {
		
		// load and register the driver		
		Class.forName("com.mysql.cj.jdbc.Driver");	
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		
		Statement st = con.createStatement();
		
		st.addBatch("insert into employee values(21, 'sam', '1000')");
		st.addBatch("insert into employee values (22, 'sang', '500')");
		st.addBatch("delete from employee where empid=101");
		
		int[] a=st.executeBatch();
		System.out.println(a.length);
	}
}