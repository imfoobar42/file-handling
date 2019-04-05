package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.Employee;
import com.capgemini.files.model.EmployeeSerialization;

public class EmployeeTest {

	private Employee employee;
	private EmployeeSerialization employeeSerialization;
	
	@Test
	public void testEmployeeSerialization() throws IOException {
		employee = new Employee(101, "John Doe", 45000);
		employeeSerialization = new EmployeeSerialization();
		assertTrue(employeeSerialization.writeObjectInFile("employee.ser"));
		
	}

}
