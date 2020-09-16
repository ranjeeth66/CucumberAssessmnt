package supportLibraries;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utility{
	
	public static int PAGE_LOAD_TIMEOUT = 30;
	public static int IMPLICIT_WAIT = 20;
	public static String getPropertiesFromConfig(String stKey)
	{
		String configData = null;
		try {
			File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Settings.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fis);
			configData = properties.getProperty(stKey);
		} catch (Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		return configData;
	}
	
	
}
