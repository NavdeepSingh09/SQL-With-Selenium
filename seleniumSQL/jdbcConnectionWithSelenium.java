package seleniumSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcConnectionWithSelenium {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			String dbURL = "jdbc:sqlserver://fe80::f945:59aa:9c02:878e%5:1433;" + "databaseName=db1;integratedSecuriy=true;";
		
		 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        //Creating connection to the database
	        Connection con = DriverManager.getConnection(dbURL);
	        //Creating statement object
	    	Statement st = con.createStatement();
	    	String selectquery = "SELECT * FROM students1";
	        //Executing the SQL Query and store the results in ResultSet
	    	ResultSet rs = st.executeQuery(selectquery);
	    	//While loop to iterate through all data and print results
	    	while (rs.next()) {
	    		System.out.println(rs.getString("transaction_datetime"));
	    	}
	        //Closing DB Connection
	    	con.close();
	     
	}


}
