package com.capgemini.files.test;

import static org.junit.Assert.*;


import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.CountWord;
import com.capgemini.files.model.FileExistApplication;


public class CountWordTest {

	private CountWord countWord;
	private FileExistApplication fileExist;
	@Test
	public void testWhenWordCountIsCorrect() throws IOException {
		countWord = new CountWord("test.txt");
		assertEquals(11, countWord.findWordCount());
	}
	@Test
	public void testWhenTheFileDoesNotExist() throws IOException {
		fileExist = new FileExistApplication("hello.txt");
		assertFalse(fileExist.doesExist());
	}
	
	@Test
	public void testWhenTheFileisEmpty() throws IOException{
		countWord = new CountWord("new.txt");
		assertEquals(0, countWord.findWordCount());
		
	}

}
