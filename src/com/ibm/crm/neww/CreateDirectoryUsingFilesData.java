package com.ibm.crm.neww;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryUsingFilesData {
	
	public static void main(String[] args) {	
		try {
			Path path = Paths.get("test_dir");
			Files.createDirectories(path);
			System.out.println("Directory created successfully: " + path.toAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Path path = Paths.get("parent_dir/child_dir");
			Files.createDirectories(path);
			System.out.println("Directories created successfully: " + path.toAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
