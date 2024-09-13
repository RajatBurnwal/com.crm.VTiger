package genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This is a generic class to read data from properties file
 * @author rajat burnwal
 * @version 8.28.24
 */
public class PropertiesUtility {

	/**
	 * This is a generic method to read data from properties file
	 * @param data
	 * @return
	 * @throws Exception
	 */
	public String readDataFromProperties(String data) throws Exception
	{
		FileInputStream fis=new FileInputStream(IConstantUtility.propertiesPath);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(data);
		return value;
		
	}
}
