package WebApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import GetPropertyData.GetProperty;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	WebDriver driver;

	GetProperty property;

	public Base_Class(WebDriver driver) {

		this.driver = driver;

	}

	public WebDriver initiationbrowser() throws IOException {

		property = new GetProperty();
		property.Data();

		String browserName = property.prop.getProperty("Browser");

		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else if (browserName.equalsIgnoreCase("safari")) {
			System.out.println("open the safari browser");
			WebDriverManager.edgedriver().setup();
			System.out.println("open the safari browser");
			driver = new SafariDriver();
			System.out.println("open the safari browser");
			driver.manage().window().maximize();
		}
		// return driver;
		return driver;

	}

}
