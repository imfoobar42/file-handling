package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	private String filePath;
	private int lineCount;
	private BufferedReader bReader;
	public LineCount() {
		super();
	}
	public LineCount(String filePath) throws IOException {
		super();
		this.filePath = filePath; 
		bReader = new BufferedReader(new FileReader(filePath));
	}
	public String getPath() {
		return filePath;
	}
	public void setPath(String path) {
		this.filePath = path;
	}
	
	public int findLineCount() throws IOException 
	{
		while(bReader.readLine() !=null)
		{
			lineCount++;
		}
		return lineCount;
	}
	
}
