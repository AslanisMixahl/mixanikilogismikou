package mix1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Helpers {

	public static Connection connectDatatbase()
	{	
		Connection conn = null;			
		try
		{
		
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://localhost:3306/mix1";
			String connectionUser = "root";
			String connectionPassword = "123456789";
			conn = DriverManager.getConnection(connectionUrl, connectionUser,
			connectionPassword);	
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return conn;	
	}
	
	public static ResultSet getResults(Connection conn,String query){
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{
		
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public static void executeUpdate(Connection conn,String query){
		Statement stmt = null;
		
		try
		{
		
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
