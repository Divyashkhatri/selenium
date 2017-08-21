package Harshasirprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DatabaseConnectionMySQL 
{
	public static void main(String[] args) throws SQLException
	{	
		String database_name="sakila";//depends on  database
		String username="root";//depends on user
		String password="root";//depends on user

		//both URL are working 
		String URL="jdbc:mysql://localhost/";//working
		 URL="jdbc:mysql://localhost:3306/";//working
		
		 String driver="com.mysql.jdbc.Driver";//fixed for "mysql community server" database

	
		
		ResultSet rset=null;
		Connection conn = null;
		PreparedStatement pstmt=null;
		try
		{
			Class.forName(driver).newInstance();
			conn =	DriverManager.getConnection(URL+database_name,username,password);
			Statement stmt=conn.createStatement();
			rset = stmt.executeQuery("select * from actor");
			
			//one line code of above code
//			rset=DriverManager.getConnection(URL+database_name,username,password).createStatement().executeQuery("select * from actor");

			while(rset.next())
			System.out.println(rset.getString(1)+"   "+rset.getString(2)+" "+rset.getString("last_name"));
			
			
			System.out.println("******************prepared statement***********************");

			/*			PreparedStatement pstmt=conn.prepareStatement("select * from actor where first_name like ? order by first_name");
			pstmt.setString(1, "J%");
//			pstmt.setString(2, "JIM");
			ResultSet rset1 = pstmt.executeQuery();
			while(rset1.next())
				System.out.println(rset1.getString(1)+"  "+rset1.getString(2)+"  "+rset1.getString(3)+"  "+rset1.getString(4));

			 */
			System.out.println("******************************Procedure call******************************");

			/*		
			We are calling below given stored procedure
				 	CREATE PROCEDURE demoSp(IN inputParam VARCHAR(255), \
				    INOUT inOutParam INT)
					BEGIN
				    DECLARE z INT;
				    SET z = inOutParam + 1;
				    SET inOutParam = z;
				    SELECT inputParam;
				    SELECT CONCAT('zyxw', inputParam);
					END
			 */

/*			CallableStatement cstmt = conn.prepareCall("{call demoSp(?, ?)}");
			cstmt.registerOutParameter(2,Types.DECIMAL,3);
			cstmt.registerOutParameter(2,Types.INTEGER);	
			cstmt.registerOutParameter("inOutparam", Types.INTEGER);
			//set input parameters
			cstmt.setString(1, "abcdef"); //using index
			cstmt.setString("inputParam", "abcdef"); // using varible name
			//set in/out parameters using index
			cstmt.setInt(1,123456);
			cstmt.setInt(2,123456);
			// set in/out parameter using parameter name
			cstmt.setInt("inparam", 123456);
			cstmt.setInt("inoutparam",123456);  // in out para

			boolean hadResult=cstmt.execute();

			while(hadResult)
			{
				ResultSet rset2 = cstmt.getResultSet();
				hadResult=cstmt.getMoreResults();
			}
			
			int outputValue = cstmt.getInt(2); //index based output retrival
			outputValue=cstmt.getInt("inOutParam");// name based output retrival
		*/
			System.out.println("************************ Insert(add row) in database************************");
			/*	pstmt=conn.prepareStatement("insert into actor values (?,?,?,?)");
			// if we re-insert the same value then we will get "MySQLIntegrityConstraintViolationException
			pstmt.setInt(1,202);
			pstmt.setString(2,"Divyash");
			pstmt.setString(3,"khatri");
			pstmt.setString(4,"2017-07-12 01:08:33");
			int status=pstmt.executeUpdate();
			if(status==1)
				System.out.println("data is inserted");
*/			System.out.println("***********************************************************************");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			conn.close();
		}
	}
}
