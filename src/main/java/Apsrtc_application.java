import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apsrtc_application {

	
	WebDriver driver;
	@Test
	public void firstScript() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
	
        driver.get("https://www.apsrtconline.in/oprs-web/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("HYDERABAD");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='destination']")).sendKeys("BANGALORE");
		
		driver.findElement(By.id("txtJourneyDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[3]/a")).click();		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[2]/td[3]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"fromPlaceName\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"toPlaceName\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='searchBtn']")).click();	
		
	}
	
	
	
}
