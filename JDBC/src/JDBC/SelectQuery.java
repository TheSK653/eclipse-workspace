package JDBC;

import java.sql.*;

public class SelectQuery {
	public static void main(String[] args) throws Exception{

		// load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connect driver manager with url,username, password
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		
		//create object of statement
		Statement st = con.createStatement();
		
		// write a query
		String query = "select * from Employee";
		
		//execute the query and store the result in result set
		ResultSet rs = st.executeQuery(query);
		
//		while(rs.next()) {
//			System.out.print(rs.getInt("empid")+"	");
//			System.out.print(rs.getString("empname")+"	");
//			System.out.println(rs.getString("empsalary")+"	");
//		}

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3));
		}
		
		// to view the details of database
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDatabaseProductVersion());
		System.out.println(dbmd.getNumericFunctions());
		
		// to view the details of specific tables
		ResultSetMetaData rsmd = rs.getMetaData();
		
//		System.out.println(rsmd.getColumnCount());
//		System.out.println(rsmd.getColumnName(1));
		
		int colNumber = rsmd.getColumnCount();			// to view the metadata of table we use ResultsetMetaData
		for (int i = 1; i <= colNumber; i++) {
			System.out.println(rsmd.getColumnName(i));
		}
		
		con.close();
	}
}