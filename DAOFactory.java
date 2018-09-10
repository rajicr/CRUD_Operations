package git.jdbc;
import java.util.*;
import git.jdbc.EmployeeDAO;
import git.jdbc.EmployeeDAOimp;
public class DAOFactory{
	private DAOFactory(){};
	public static EmployeeDAO ed=null;
	public static EmployeeDAO getDAOInstance(){
		if(ed==null){
			ed=new EmployeeDAOimp();
		}
	return ed;
	}
}
	
