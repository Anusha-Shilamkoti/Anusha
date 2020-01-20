package Jdbc_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class InsertPrepare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//Load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Create the connection object
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			//Inserting values to the table
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");
			ps.setInt(1, 1003);
			ps.setString(2, "Praveen");
			ps.setInt(3, 30000);
			
			int i=ps.executeUpdate();
			System.out.println(i+" Records Inserted");
			
			//close the connection object
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}