package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperties {

	public static String getPropData(String key) throws IOException
	{
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "\\config.properties";

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String value = prop.getProperty(key);

		System.out.println(value);
		
		return value;

	}
	
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "\\config.properties";

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String url = prop.getProperty("testsiteurl");

		System.out.println(url);

	}

}
