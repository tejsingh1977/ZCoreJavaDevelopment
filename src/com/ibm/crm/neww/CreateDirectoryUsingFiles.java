package com.ibm.crm.neww;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryUsingFiles {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("new_test_dir");
			Files.createDirectory(path);
			System.out.println("Directory created successfully: " + path.toAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}

}
