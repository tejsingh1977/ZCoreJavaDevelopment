package com.ibm.crm.neww;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile {
	
	public static void main(String[] args) {		
		try {
			Path path = Paths.get("C:\\Users\\jay\\Downloads\\deployment\\message.txt");
			Path paths = Files.createFile(path);
			System.out.println("File Path details := >>> " + path.toAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}
