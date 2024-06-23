package com.ibm.crm.neww;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryWithExceptionHandling {
	
	public static void main(String[] args) {
		Path path = Paths.get("new_directory");
        try {
            Files.createDirectory(path);
            System.out.println("Directory created successfully: " + path.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        } 
	}

}
