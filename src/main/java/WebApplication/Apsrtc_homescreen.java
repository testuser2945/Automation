package WebApplication;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import GetPropertyData.GetProperty;

public class Apsrtc_homescreen {

	WebDriver driver;
	GetProperty filesss;

	@FindBy(xpath = "//input[@type='text']")
	public WebElement sourceTextfield;

	@FindBy(xpath = "//input[@name='destination']")
	public WebElement destinationTextfield;
	
	@FindBy(id = "txtJourneyDate")
	public WebElement journeyTextfield;
	
	
	
	public Apsrtc_homescreen(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebDriver typeHyderabad() throws IOException, InterruptedException {

		filesss = new GetProperty();
		filesss.Data();
		sourceTextfield.sendKeys(filesss.prop.getProperty("fromAddress"),Keys.ENTER);
			
		String actSourceAddress ="HYDERABAD";
		String expSourceAddress = filesss.prop.getProperty("fromAddress");
				
		Assert.assertEquals(actSourceAddress, expSourceAddress);
		System.out.println(actSourceAddress);
		Thread.sleep(3000);
		return driver;

	}

	public WebDriver typeKurnool() throws IOException, InterruptedException {

		driver = typeHyderabad();
		filesss = new GetProperty();
		filesss.Data();
		destinationTextfield.sendKeys(filesss.prop.getProperty("toAddress"),Keys.ENTER);
		String actDestinationAddress ="KURNOOL";
		String expDestinationAddress = filesss.prop.getProperty("toAddress");			
		Assert.assertEquals(actDestinationAddress, expDestinationAddress);
		System.out.println(actDestinationAddress);	
		Thread.sleep(3000);
		return driver;
	}

	public WebDriver departOnTextField() throws IOException, InterruptedException {
		driver=typeKurnool();
		journeyTextfield.click();
		Thread.sleep(3000);
		return driver;
		
	}
	
	public WebDriver dateSelect() throws IOException, InterruptedException {
		driver=departOnTextField();
		return driver;
	}
	
	
	
	}


