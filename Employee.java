package git.jdbc;
import java.util.*;
public class Employee{
	private int Eno;
	private String Ename;
	private int Eage;
	public Employee(){};
	public Employee(int no,String name,int age){
		this.Eno=no;
		this.Ename=name;
		this.Eage=age;
	}
	public int getEno(){
		return Eno;
	}
	public String getEname(){
		return Ename;
	}
	public int getEage(){
		return Eage;
	}
	public void setEno(int no){
		this.Eno=no;
	}
	public void setEname(String name){ 
		this.Ename=name;
	}
	public void setEage(int age){
		this.Eage=age;
	}
	public String toString(){
		return "Employee["+Eno+"|"+Ename+"|"+Eage+"]";
		}
}	
