package com.ems.menu;

import java.util.List;
import java.util.Scanner;

import com.ems.bean.Employee;
import com.ems.daoimpl.EmployeeDAOImpl;

public class EmployeeDetails {
      static Scanner sc = new Scanner(System.in);
      static EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

  	public static void adminMenu() {
  		System.out.println("-----------------------");
  		System.out.println("|   ADMIN MAIN MENU   |");
  		System.out.println("-----------------------");
  		System.out.println("| 1.ADD Employee       |");
  		System.out.println("| 2.VIEW Employee      |");
  		System.out.println("| 3.VIEW ALL Employees |");
  		System.out.println("| 4.UPDATE Employee    |");
  		System.out.println("| 5.DELETE Employee  |");
  		System.out.println("| 6.BACK              |");
  		System.out.println("-----------------------");
  		System.out.println("Enter Your Choice ?");
  		int choice = sc.nextInt();
  		switch (choice) {
  		case 1:
  			employeeDAO.addEmployee();
  			adminMenu();
  			break;
  		case 2:
  			System.out.println("Enter Your Search Employee Id ?");
  			Employee emp = employeeDAO.viewEmployee(sc.nextInt());
  			System.out.println("EID" + "\t" + "ENAME" + "EAge" + "\t" + "EDept"+"\t"+"Salary"+"\t"+"Leaves");
  			System.out.println("------------------------------------");
  			System.out.println(emp);
  			adminMenu();
  			break;
  		case 3:
  			List<Employee> employees = employeeDAO.viewAllEmployees();
  			System.out.println("EID" + "\t" + "ENAME" + "EAGE" + "\t" + "EDEPT"+"\t"+"Salary"+"\t"+"Leaves");
  			System.out.println("------------------------------------");
  			for (Employee e : employees) {
  				System.out.println(e);
  			}
  			adminMenu();
  			break;
  		case 4:
  			System.out.println("Enter Updating Employee Id ?");
  			employeeDAO.updateEmployee(sc.nextInt());
  			adminMenu();
  			break;
  		case 5:
  			System.out.println("Enter Deleting Employee Id ?");
  			employeeDAO.deleteEmployee(sc.nextInt());
  			adminMenu();
  			break;
  		case 6:
  			employeeDAO.back();
  			break;
  		default:
  			System.out.println("Please select your choice range 1-6 only");

  		}
  	}

  	public static void employeeMenu() {
  		System.out.println("-----------------------");
  		System.out.println("|  Employee MAIN MENU   |");
  		System.out.println("-----------------------");
  		System.out.println("| 1.VIEW Employee      |");
  		System.out.println("| 2.VIEW ALL Employees |");
  		System.out.println("| 3.BACK               |");
   		System.out.println("-----------------------");
  		System.out.println("Enter Your Choice ?");
  		int choice = sc.nextInt();
  		switch (choice) {

  		case 1:
  			System.out.println("Enter Your Search Employee Id ?");
  			Employee emp = employeeDAO.viewEmployee(sc.nextInt());
  			System.out.println("EID" + "\t" + "ENAME" + "EAge" + "\t" + "EDept"+ "\t" +"Salary"+ "\t" +"Leaves");
  			System.out.println("------------------------------------");
  			System.out.println(emp);
  			employeeMenu();
  			break;
  		case 2:
  			List<Employee> employees = employeeDAO.viewAllEmployees();
  			System.out.println("EID" + "\t" +"ENAME" + "\t" + "EAGE" + "\t" + "EDEPT" + "Salary" + "\t" + "Leaves");
  			System.out.println("------------------------------------");
  			for (Employee e : employees) {
  				System.out.println(e);
  			}
  			employeeMenu();
  			break;
  		case 3:
  			employeeDAO.back();
  			employeeMenu();
  			break;
  		default:
  			System.out.println("Please select your choice range 1-4 only");

  		}
  	}
}
