package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Read_Property_File 
{
	public static String readData(String key) throws IOException//url
	{
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\test_data\\config.properties";

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		System.out.println(value); // print url, username, password
		return value;// return to method (url, username, password)
	}
}
