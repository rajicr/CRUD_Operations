package git.jdbc;
import java.util.*;
import git.jdbc.DAOFactory;
import git.jdbc.EmployeeDAO;
import git.jdbc.Employee;
public class Main{
	public static void main(String[] args)throws Exception{
		EmployeeDAO DAO=DAOFactory.getDAOInstance();
		Scanner sc=new Scanner(System.in);
		String answer="y";
		while(answer.equalsIgnoreCase("y")){
		System.out.println("what operation do you want to perfrom");
		System.out.println("1.Insert");
		System.out.println("2.Retrive one row");
		System.out.println("3.Update");
		System.out.println("4.Retive all column");
		System.out.println("5.Delete");
		System.out.println("please enter the number");
		int num=sc.nextInt();
		if(num==1 & num<6){
			System.out.println("Insert Mode");
			System.out.println("enter employee no, name and age");
			int no=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			Employee e=new Employee();
			DAO.saveEmp(e);
		}
		else if(num==2 & num<6){
			System.out.println("Retrive a row");
			System.out.println("enter the employee number you want to retrive");
			int eno=sc.nextInt();
			Employee em=((EmployeeDAOimp)DAO).searchEmp(eno);
			if(em!=null){
				System.out.println(em);
			}
			else{
				System.out.println("entered employee number does not exist");
			}
		}
		else if(num==3 & num<6){
			System.out.println("Update Mode");
			System.out.println("enter the no,name & age");
			int no=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			Employee e=new Employee(no,name,age);
			System.out.println(e.getEname());
			System.out.println(e.getEage());
			System.out.println(e.getEno());
			((EmployeeDAOimp)DAO).updateEmp(e);
		}
		else if(num==4 & num<6){
			System.out.println("Retrive all Mode");
			List<Employee> e=((EmployeeDAOimp)DAO).getAllEmployee();	
			for(Employee e1:e){
				Thread.sleep(1000);
				System.out.println(e1);
			}
		}

	
		else if(num==5 & num<6){
			System.out.println("Delete Mode");
			System.out.println("enter the employee number you want to delete");
			int no=sc.nextInt();
			((EmployeeDAOimp)DAO).deleteEmp(no);
		}
		System.out.println("do you want to continue enter:y/n");
		answer=sc.next();
	}		
	}			
}
		
