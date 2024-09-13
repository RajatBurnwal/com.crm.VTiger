package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import genericUtility.IConstantUtility;

public class WritingDataToPropertiesFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(IConstantUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		prop.setProperty("hello", "java");
		FileOutputStream fos=new FileOutputStream(IConstantUtility.propertiesPath);
		prop.store(fos, "done");
		System.out.println("Data updated successfully");
		System.out.println(prop.getProperty("url"));
	}
}
