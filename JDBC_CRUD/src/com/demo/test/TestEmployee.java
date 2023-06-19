package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.ConnectionTest;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestEmployee {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		EmployeeService es=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new employee\n2. delete emplyee \n 3. modify employee");
			System.out.println("4. display all\n5. display by id \n 6. display in sorted order\n 7. exit\n choice :");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				es.addnewEmployee();
				break;
			
			case 2:
				System.out.println("Enter Empid to be deleted");
			    int empid=sc.nextInt();
				boolean status=es.deleteEmpoyee(empid);
				if(status) {
					System.out.println("Employee deleted successfully");
				}else
					System.out.println("Employee not found");
			  	break;
			  	
			case 3:
				System.out.println("Enter the id to be modified");
				empid=sc.nextInt();
				System.out.println("Enter the updated salary");
				double sal=sc.nextDouble();
				status=es.modifysal(empid,sal);
				if(status)
					System.out.println("Employee Modified Succesffully");
				else
					System.out.println("Employee not found");
				break;
			  
			case 4:
			   List<Employee>lst=es.displayAll();
			   lst.forEach(System.out::println);
			   break;
			
			case 5:
				System.out.println("Enter the id of employee to be displayed");
				empid=sc.nextInt();
				Employee e=es.displayById(empid);
				System.out.println(e);
		        break;
		        
			case 6:
				lst=es.sortBySal();
				lst.forEach(System.out::println);
				break;
				
			case 7:
				ConnectionTest.closeConnection();
				System.out.println("Thank you fr visiting!!!!");
				break;
			}
			
		}while(choice!=7);
	}

}
