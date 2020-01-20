package Jdbc_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//1.Load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.Create the connection object
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			
			//3.Create the Statement object
			Statement  st=con.createStatement();
			
			//4.Execute query
			ResultSet r=st.executeQuery("select * from employee");
			while(r.next()){
				System.out.println(r.getInt(1)+" "+r.getString(2)+" "+r.getInt(3));
			}
			//5.close the connection object
			con.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
