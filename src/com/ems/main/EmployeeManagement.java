package com.ems.main;

import java.util.Scanner;

import com.ems.menu.EmployeeDetails;

public class EmployeeManagement {
      static  Scanner sc = new Scanner(System.in);
       public static void main(String[] arr){
    	    System.out.println("  Employee Management System");
    	    System.out.println("--------------------------------");
    	    System.out.println("     1.Admin Menu");
    	    System.out.println("     2.Employee Menu");
    	    System.out.println("     3.Exit");
    	    while(true){
    	    	int choice = sc.nextInt();
    	    	switch(choice){
    	    	case 1: EmployeeDetails.adminMenu();
    	    	         break;
    	    	case 2: EmployeeDetails.employeeMenu();
    	    	         break;
    	    	case 3: System.exit(0);
    	    	         break;
    	    	default: System.out.println("Enter choice from given range only");
    	    	}
    	    }
       }
}
