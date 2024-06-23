package com.ibm.crm.old;

import java.io.File;

public class CreateNestedDirectoriesUsingFile {

	public static void main(String[] args) {

		File directory = new File("parent_dir/child_dir");
		
		if (directory.mkdirs()) {
			System.out.println("Directories created successfully: " + directory.getAbsolutePath());
		} else {
			System.out.println("Failed to create directories.");
		}

	}
}
