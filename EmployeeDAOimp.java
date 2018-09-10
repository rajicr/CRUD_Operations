package git.jdbc;
import java.util.*;
import java.sql.*;
import git.jdbc.Employee;
import git.jdbc.ConnectionFactory;
public class EmployeeDAOimp implements EmployeeDAO{
	public Statement st=null;
	public EmployeeDAOimp(){
		Connection conn=ConnectionFactory.getConnection();
		try{
			st=conn.createStatement();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public void saveEmp(Employee emp)throws Exception{
		String sql="insert into stu values('"+emp.getEname()+"',"+emp.getEno()+","+emp.getEage()+");";
		int n=st.executeUpdate(sql);
		if(n>0){
			System.out.println("saved value");
		}
	}
	public Employee searchEmp(int n)throws Exception{
		String sql="select * from stu where sno="+n;
		Employee emp=null;
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()){
			String ename=rs.getString(1);
			int eno=rs.getInt(2);
			int eage=rs.getInt(3);
			emp=new Employee(eno,ename,eage);
		}
		return emp;
	}
	public void deleteEmp(int no)throws Exception{
		String sql="delete from stu where sNo="+no;
		int n=st.executeUpdate(sql);
		if(n>0){
			System.out.println("deleted employee");
		}
	}
	public void updateEmp(Employee emp)throws Exception{
		String sql="update stu set sName='"+emp.getEname()+"',sAge="+emp.getEage()+" where sNo="+emp.getEno()+";";
		int n=st.executeUpdate(sql);
		if(n>0){
			System.out.println("updated");
		}
	}
	public List<Employee> getAllEmployee()throws Exception{
		String sql="select * from stu";
		ResultSet rs=st.executeQuery(sql);
		List<Employee> e=new ArrayList<>();
		while(rs.next()){
			String ename=rs.getString(1);
			int eno=rs.getInt(2);
			int eage=rs.getInt(3);
			Employee em=new Employee(eno,ename,eage);
			e.add(em);
		}
		return e;
	}
}
