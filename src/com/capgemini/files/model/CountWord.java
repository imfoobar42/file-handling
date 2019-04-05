package com.capgemini.files.model;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class CountWord {
	private String filePath;
	private int countWord;
	private BufferedReader bReader;
	private String content;
	public CountWord() {
		super();
	}
	public CountWord(String filePath) throws FileNotFoundException {
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
	public int findWordCount() throws IOException {
		while((content=bReader.readLine()) !=null)
		{
			String line[] = content.trim().split("\\s+");
			countWord = countWord + line.length;
		}
		return countWord;
	}
	
	
}
