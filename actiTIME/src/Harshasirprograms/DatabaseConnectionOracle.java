package Harshasirprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnectionOracle 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException 
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
//			DriverManager.registerDriver( (Driver)Class.forName("oracle.jdbc.driver.OracleDriver").newInstance());
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:xe","scott","tiger");
			// all port numbeer are working
			//1521   //3306   <--->8080<--->1<-->5
			Statement stmt=conn.createStatement();
			ResultSet rset = stmt.executeQuery("select * from emp");
			while(rset.next())
			{
				System.out.println(rset.getString(1)+"   "+rset.getString(2)+"  "+rset.getString(3));
			}
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

}
