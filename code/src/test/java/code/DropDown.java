package code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"
	    ,"C:\\Users\\JOHN\\eclipse-workspace\\newWorlspace\\code\\target\\chromedriver.exe");
	    ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();	
	    
	    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("ROHIT");
	    driver.findElement(By.xpath("//input[contains(@name,'lastna')]")).sendKeys("KARMANKAR");
	    driver.findElement(By.cssSelector("#contactpoint_step_input")).sendKeys("rohitkae@123");
	    driver.findElement(By.xpath("//span[contains(text(),'Male')]")).click();
	    
	    Thread.sleep(1000);
	    //YEAR
	    List<WebElement>Years=driver.findElements(By.xpath("//select[@id='year']//option"));
	    for(WebElement Year:Years) {
	    if(Year.getText().equals("1998")) {
	    Year.click();	
	    }
	    }
	    
	    Thread.sleep(1000);
	    //MONTH
	    List<WebElement>Months=driver.findElements(By.xpath("//select[@id='month']//option"));
	    for(WebElement Month:Months) {
	    if(Month.getText().equals("Dec")) {
	    Month.click();	
	    }
	    }
	    
	    Thread.sleep(1000);
	    //DAY
	    List<WebElement>days=driver.findElements(By.xpath("//select[@id='day']//option"));
	    for(WebElement day:days) {
	    if(day.getText().equals("15")) {
	    day.click();	
	    }
	    }
	}
	
}
