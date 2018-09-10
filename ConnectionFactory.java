package git.jdbc;
import java.util.*;
import java.sql.*;
public class ConnectionFactory{
	public static Connection conn=null;
	public static Connection getConnection(){
		if(conn==null){
			ResourceBundle bundle=ResourceBundle.getBundle("dp");
			String classname=bundle.getString("classname");
			String url=bundle.getString("url");
			String name=bundle.getString("name");
			String password=bundle.getString("password");
			try{
			Class.forName(classname);
			conn=DriverManager.getConnection(url,name,password);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		
		}
		return conn;
	}
}
