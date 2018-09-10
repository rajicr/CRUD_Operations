package git.jdbc;
import java.util.*;
import java.sql.*;
import git.jdbc.Employee;
public interface EmployeeDAO{
	void saveEmp(Employee emp)throws Exception;
//	Employee searchEmp(int n)throws Exception;
//	void updateEmp(Employee emp)throws Exception;
//	void deleteEmp(int n)throws Exception;
//	List<Employee> getAllEmployee()throws Exception;
}
	
	
