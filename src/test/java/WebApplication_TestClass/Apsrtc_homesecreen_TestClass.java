package WebApplication_TestClass;

import java.io.File;



import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import GetPropertyData.GetProperty;
import WebApplication.Apsrtc_homescreen;
import WebApplication.Base_Class;
import cucumber.api.junit.Cucumber;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.sdk.metrics.data.Data;



//@RunWith(Cucumber.class)
public class Apsrtc_homesecreen_TestClass {

	WebDriver driver;
	GetProperty filess;
	Apsrtc_homescreen apsrtc_homescreen;
	public ExtentReports extent;
	public ExtentTest logger;
	private static Logger Log;
	
	@BeforeTest
	public void reports() {
		extent = new ExtentReports("test-output// Test Results.html", true);// append results
		extent.addSystemInfo("Host Name", "BusBooking").addSystemInfo("Environment", "Qa").addSystemInfo("User Name",
				"Chathrapathi");

		logger = extent.startTest("RedBus");
		extent.loadConfig(new File(System.getProperty("user.dir") + "\\config.xml"));

		Log = LogManager.getLogger(Apsrtc_homesecreen_TestClass.class);
	}

	
	//@Given("^User intialize the browser$")
	
	@Test
	public void getUrl() throws Exception {

		Base_Class browsers = new Base_Class(driver);
		this.driver = browsers.initiationbrowser();

		GetProperty filess = new GetProperty();
		filess.Data();
		driver.get(filess.prop.getProperty("url"));
		apsrtc_homescreen = new Apsrtc_homescreen(driver);

	}

	//@When("User open the url")
	public void clickSourceTextField() throws IOException, InterruptedException {
		apsrtc_homescreen.typeHyderabad();

	}

	//@Then("^User Login to (.+) and (.+) the  application$")
	public void clickDestinationTextField() throws IOException, InterruptedException {		
		apsrtc_homescreen.typeKurnool();
		logger.log(LogStatus.PASS, "textfield should be tappable");
	}
	
	//@Then("^User Login Page to (.+) and (.+) the  application$")
	public void clickJourneyTextfield() throws IOException, InterruptedException {
		apsrtc_homescreen.departOnTextField();
	}
}
