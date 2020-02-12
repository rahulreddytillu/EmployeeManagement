package com.ems.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
import com.ems.main.EmployeeManagement;
//import com.ems.menu.EmployeeDetails;

public class EmployeeDAOImpl implements EmployeeDAO{
	Scanner sc = new Scanner(System.in);
	static List<Employee> employees = new ArrayList<Employee>();
	static List<Employee> tempList = new ArrayList<Employee>();
	Employee emp = null;
	
	@Override
	public void addEmployee() {
		int i=1;
		while(i==1)
		{
			emp = new Employee();
			System.out.println("Enter Employee id ?");
			emp.setEid(sc.nextInt());
			System.out.println("Enter Epmloyee Name ?");
			emp.setEname(sc.next());
			System.out.println("Enter Epmloyee age ?");
			emp.setEage(sc.nextInt());
			System.out.println("Enter Emlpoyee dept ?");
			emp.setEdept(sc.next());
			System.out.println("Enter salary amount ?");
			emp.setEsalary(sc.nextDouble());
			System.out.println("Enter employee leaves");
			emp.setNoofleaves(sc.nextInt());
			employees.add(emp);
			System.out.println("Do you want to add more employees press 1 else any number?");
			i = sc.nextInt();
			
		}
		System.out.println("Successfully added employees...");
		
	}

	@Override
	public Employee viewEmployee(int eid) {
		Employee em = new Employee();
		for(Employee e1:employees){
			if(e1.getEid()==eid){
				em=e1;
				break;
			}
		}
		return em;	
	}

	@Override
	public List<Employee> viewAllEmployees() {
		return employees;
	}
	@Override
	public void updateEmployee(int eid) {
		tempList  = new ArrayList<Employee>();
		for(Employee e2:employees)
		{
			if(e2.getEid()==eid)
			{
				System.out.println("Select Your Choice 1.Ename 2.Eage  3. Edept 4. Esal 5. leaves ");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("Enter Updated Employee Name ?");
				       e2.setEname(sc.next());
				       break;
				case 2:System.out.println("Enter Updated employee age ?");
				       e2.setEage(sc.nextInt());
				       break;
				case 3:System.out.println("Enter Updated employee dept?");
				       e2.setEdept(sc.next());
				       break;
				case 4:System.out.println("Enter updated employee salary");
				       e2.setEsalary(sc.nextDouble());
				       break;
				case 5:System.out.println("Enter updated employee leaves");
				        e2.setNoofleaves(sc.nextInt());
				        break;
				default:System.out.println("Please select your choice range 1-3 only");       
				}
				tempList.add(e2);
			}else{
				tempList.add(e2);
			}
		}
		employees = new ArrayList<Employee>();
		for(Employee e3:tempList)
		{
			employees.add(e3);
		}
		System.out.println("Successfullu Product Updated....");
	}

	@Override
	public void deleteEmployee(int eid) {
		tempList = new ArrayList<Employee>();
		for(Employee e4:employees){
			if(e4.getEid()==eid){
				
			}else{
				tempList.add(e4);
			}
		}
		employees  = new ArrayList<Employee>();
		for(Employee e5:tempList){
			employees.add(e5);
		}
		System.out.println("successfully deleted an employee");
	}

	@Override
	public void back() {
		EmployeeManagement.main(null);
	}
       
}
