package com.ibm.crm.old;

import java.io.File;

public class CreateDirectoryUsingFile {

	public static void main(String[] args) {

		File directory = new File("new_directory");
		if (directory.mkdir()) {
			System.out.println("Directory created successfully: " + directory.getAbsolutePath());
		} else {
			System.out.println("Failed to create directory.");
		}

		File nestedDirectory = new File("parent_directory/child_directory");
		if (nestedDirectory.mkdirs()) {
			System.out.println("Directories created successfully: " + nestedDirectory.getAbsolutePath());
		} else {
			System.out.println("Failed to create directories.");
		}
	}

}
