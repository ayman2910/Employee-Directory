package com.employeeManagementCRUD.EmployeeDirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeDirectoryApplication {

	public static void main(String[] args) {
		System.out.println("no datasource configured");
		SpringApplication.run(EmployeeDirectoryApplication.class, args);
	}

}
