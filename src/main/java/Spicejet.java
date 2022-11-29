import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Spicejet {

	WebDriver driver;

	@Test
	public void spicejetApplication() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		/*
		 * driver.findElement(By.id("divpaxinfo")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement adults = driver.findElement(By.id("hrefIncAdt"));
		 * 
		 * for (int i = 0; i < 4; i++) {
		 * 
		 * adults.click(); Thread.sleep(3000); }
		 * 
		 * driver.findElement(By.id("btnclosepaxoption")).click();
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * );
		 * 
		 * int cities = driver.findElements(By.xpath("//td[@class='mapbg']")).size();
		 * 
		 * for (int i = 0; i < cities; i++) { System.out.println("Total count:" +
		 * cities);
		 * 
		 * String Allcities =
		 * driver.findElements(By.xpath("//td[@class='mapbg']")).get(i).getText();
		 * 
		 * System.out.println(Allcities);
		 * 
		 * int count = 0; List<WebElement> optionsList =
		 * driver.findElements(By.xpath("//a[@text='Hyderabad (HYD)']"));
		 * 
		 * for (WebElement allList : optionsList) {
		 * 
		 * allList.click(); count++; break;
		 * 
		 * }
		 * 
		 * if (count != 0) { System.out.println(optionsList +
		 * "has been selected in the departure city"); } else
		 * System.out.println("option u want to select is not available in the list"); }
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).
		 * click();
		 * 
		 * driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * int allDates =
		 * driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		 * 
		 * for(int i=0;i<allDates;i++) {
		 * 
		 * System.out.println(allDates);
		 * 
		 * 
		 * String values =
		 * driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).
		 * getText();
		 * 
		 * if(values.equalsIgnoreCase("30")) {
		 * 
		 * driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click(
		 * ); break;
		 */

		/*
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 * 
		 * driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(
		 * );
		 * 
		 * driver.findElement(By.xpath("//a[@text='Hyderabad (HYD)']")).click();
		 * 
		 * Thread.sleep(3000);
		 * driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();
		 * 
		 * int allDates =
		 * driver.findElements(By.xpath("//a[@class='ui-state-default']")).size();
		 * 
		 * for (int i = 0; i < allDates; i++) {
		 * 
		 * System.out.println(allDates);
		 * 
		 * String values =
		 * driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).
		 * getText();
		 * 
		 * if(values.equalsIgnoreCase("25")) {
		 * 
		 * driver.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click(
		 * );
		 * 
		 * 
		 * Thread.sleep(3000); break; } }
		 * 
		 * driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * //driver.findElement(By.xpath(
		 * "(//*[@id='ui-datepicker-div'])//parent::div//parent::body//parent::html/body/div/div[2]/table/tbody/tr[4]//td[3]/a"
		 * )).click();
		 * 
		 * 
		 * driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr[5]/td[7]/a"
		 * )).click(); Thread.sleep(3000);
		 */
		
		 driver.findElement(By.id("autosuggest")).sendKeys("UK");
		
		 int dataVariable = driver.findElements(By.xpath("//a[@class='ui-corner-all']")).size();
		 
		 for(int i=0;i<dataVariable;i++) {
			 
			 System.out.println(dataVariable);
			 
			 Thread.sleep(3000);
			String allVariable = driver.findElements(By.xpath("//a[@class='ui-corner-all']")).get(i).getText();
			 
			if(allVariable.contains("United Kingdom (UK)")) {
				 driver.findElements(By.xpath("//a[@class='ui-corner-all']")).get(i).click();
				 
				break;
				
			}
			 
		 }
		 
		 
			
		}
			}
			
			
		
			
		
	


