package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {

		/*
		 * File file = new File("5");
		 * System.out.println(file.exists());
		 * 
		 * 
		 * System.out.println(folder.exists());
		 */

		/*
		 * File file = new File("test.txt"); if (!file.exists()) { file.createNewFile();
		 * System.out.println("File is created"); }
		 * 
		 * //FileWriter writer = new FileWriter(file, true); //BufferedWriter writer =
		 * new BufferedWriter(new FileWriter(file)); PrintWriter writer = new
		 * PrintWriter(new BufferedWriter(new FileWriter(file, true)));
		 * writer.println("Hello\n"); writer.println("How are you???\n");
		 * writer.println("I hope you are fine\n"); writer.println("Bye\n");
		 * 
		 * writer.close(); System.out.println("Content has been written successfully");
		 */
		
		/*
		 * FileReader reader = new
	
		 * BufferedReader bReader = new BufferedReader(reader);
		 * 
		 * PrintWriter writer = new PrintWriter("BankAccount.java");
		 * 
		 * String content; while((content = bReader.readLine()) != null) {
		 * writer.println(content);
		 * 
		 * } System.out.println("Success"); writer.close(); bReader.close();
		 * reader.close();
		 */
		
		/*
		 * File windowsDirectory = new File("c:\\windows");
		 * System.out.println(windowsDirectory.isDirectory()); String content[] =
		 * windowsDirectory.list();
		 * 
		 * for(String s: content) { System.out.println(s); }
		 */
		
		File newDir = new File("myDir");
		if(! newDir.exists())
		{
			newDir.mkdir();
			System.out.println("Folder created successfully");
		}
		
		File file = new File(newDir, "myFile.txt");
		if(! file.exists()) {
			file.createNewFile();
			System.out.println("file successfully created");
		}
	}

}
