package GetPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {

	public Properties prop;

	public void Data() throws IOException {

		FileInputStream fis = new FileInputStream(
				"E:\\Chathrapathi\\Eclipse_Workspace\\AutomationWithSelenium\\java.Properties");

		prop = new Properties();

		prop.load(fis);

	}
}
