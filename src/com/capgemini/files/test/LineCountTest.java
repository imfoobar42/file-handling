package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.FileExistApplication;
import com.capgemini.files.model.LineCount;

public class LineCountTest {

	private LineCount lineCount;
	private FileExistApplication fileExist;
	
	@Test
	public void testWhenCountIsCorrect() throws IOException {
		lineCount = new LineCount("C:\\Akash\\CoreJava\\Basic-Assignments\\src\\Armstrong.java");
		assertEquals(24, lineCount.findLineCount());
	}
	@Test
	public void testWhenTheFileDoesNotExist() throws IOException {
		fileExist = new FileExistApplication("hello.txt");
		assertFalse(fileExist.doesExist());
	}
	
	@Test
	public void testWhenTheFileisEmpty() throws IOException{
		lineCount = new LineCount("new.txt");
		assertEquals(0, lineCount.findLineCount());
		
	}

}
