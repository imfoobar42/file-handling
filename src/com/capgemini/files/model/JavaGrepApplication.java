package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import com.capgemini.files.exception.StringNotFoundException;

public class JavaGrepApplication {

	private String filePath;
	private BufferedReader bReader;
	private HashMap<Integer, String> actualHashMap = new HashMap<>();
	private String content;
	private int lineCount;
	public JavaGrepApplication() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JavaGrepApplication(String filePath) throws FileNotFoundException {
		super();
		this.filePath = filePath;
		bReader = new BufferedReader(new FileReader(filePath));
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	public HashMap<Integer,String> findString(String string) throws IOException, StringNotFoundException
	{
		while((content=bReader.readLine()) !=null)
		{
			lineCount++;
			String line[] = content.trim().split(" ");
			for(int i=0; i<line.length; i++)
			{
				if(line[i].equals(string))
				{
					actualHashMap.put(lineCount, content);
				}
			}
		}
		if(actualHashMap.isEmpty())
			throw new StringNotFoundException("The string was not found");
		return actualHashMap;
	}
	
	
}
