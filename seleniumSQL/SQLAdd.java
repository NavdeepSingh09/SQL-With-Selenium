package seleniumSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLAdd {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=db1;integratedSecurity=true;";
					
					 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					 
				        //Creating connection to the database
				        Connection con = DriverManager.getConnection(dbURL);

		String query = "insert into students1(stId,stName,city,Mobile,Address)values(4,'singh', 'saskatoon',604,'avenue')";

				        Statement st = con.createStatement();
				        
				        ResultSet rs3 = st.executeQuery(query);
				        System.out.println(rs3);
	}

}
