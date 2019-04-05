
package com.capgemini.files.model;

import java.io.File;
import java.io.IOException;

public class FileExistApplication {
	private String filePath;
	private File file;

	public FileExistApplication() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FileExistApplication(String filePath) throws IOException {
		super();
		this.filePath = filePath;
		file = new File(filePath);
	}

	public boolean doesExist()
	{
		return file.exists();
	}
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	
}