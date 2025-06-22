package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.util.Properties;

public class FileReaderManager {
	private static FileInputStream fileinputstream;
	private static Properties property;
	
	private static void setupProperty() throws IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\MavenProject\\src\\main\\resource\\Lumadata.properties");
		try {
			 fileinputstream = new FileInputStream(file);
			 property =new Properties();
			property.load(fileinputstream);
			
	 	} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public    String getDataProperty(String keyData) {
		try {
			setupProperty();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String value = property.getProperty(keyData);
		return value;
	}
//	public static void main (String[] args) {
//		System.out.println(getDataProperty("url"));
//	}

}
	