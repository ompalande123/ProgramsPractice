package org.omkar.programsPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	public static void main(String[] args) throws IOException {
		
		
		// Location of the file
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\myPropFile.properties");
		
		
		// Load a properties file
		Properties prop=new Properties();
		prop.load(file);
		
		// Reading data from properties file
		String username = prop.getProperty("user");
		String upackage = prop.getProperty("package");
		
		System.out.println("Properties file data == "+username+" and "+upackage);
		
		
		
	}

}
