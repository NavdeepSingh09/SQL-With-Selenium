package seleniumSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLSelect {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String dbURL = "jdbc:sqlserver://localhost:Local Host PORT;databaseName=db1;integratedSecurity=true;";
					
					 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					 
				        //Creating connection to the database
				        Connection con = DriverManager.getConnection(dbURL);
				        //Creating statement object              
				        Statement stmt = con.createStatement();
				        ResultSet rs = stmt.executeQuery("SELECT * FROM students1 where stId=1");
				        
				           	while (rs.next()) {
				    		  String lastName = rs.getString("stName");
				    		  String city= rs.getString("city");
				    		  System.out.println(lastName + "\n");
				    		  System.out.println(city + "\n");
				    		}
				    	con.close();
			}


}
