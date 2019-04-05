package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

import com.capgemini.files.exception.StringNotFoundException;
import com.capgemini.files.model.JavaGrepApplication;

public class JavaGrepApplicationTest {

	private JavaGrepApplication javaGrepApplication;
	
	@Test
	public void testWhenStringIsFound() throws IOException, StringNotFoundException {
		javaGrepApplication = new JavaGrepApplication();
		HashMap<Integer, String> expectedMap = new HashMap<>();
		expectedMap.put(20, "HINT:- Use Serialization and Deserialization");
		expectedMap.put(28, "HINT:- Use Serialization and Desrialization with Collection");
		assertEquals(expectedMap, javaGrepApplication.findString("Serialization"));
		
	}
	
	@Test(expected = StringNotFoundException.class)
	public void testWhenStringIsNotFound() throws IOException, StringNotFoundException {
		javaGrepApplication = new JavaGrepApplication();
		javaGrepApplication.findString("wassup");
		
	}

}
