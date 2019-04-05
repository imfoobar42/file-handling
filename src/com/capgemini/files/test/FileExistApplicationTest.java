package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.model.FileExistApplication;

public class FileExistApplicationTest {

	private FileExistApplication fileExist;

	@Test
	public void testWhenTheFileExists() throws IOException {
		fileExist = new FileExistApplication("account.ser");
		assertTrue(fileExist.doesExist());
	}

	@Test
	public void testWhenTheFileDoesNotExist() throws IOException {
		fileExist = new FileExistApplication("account1.ser");
		assertFalse(fileExist.doesExist());
	}
}
