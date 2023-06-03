package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver"
	,"C:\\Users\\JOHN\\eclipse-workspace\\newWorlspace\\code\\target\\chromedriver.exe");
    ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();	
		
	driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
	driver.findElement(By.xpath("//select[@title='Change the year']//option[23]")).click();
	
	Thread.sleep(1000);
	WebElement Year=driver.findElement(By.xpath("//select[@title='Change the year']"));
	Select y=new Select(Year);
	y.selectByVisibleText("2050");
	
	Thread.sleep(1000);
	WebElement Month=driver.findElement(By.xpath("//select[@title='Change the month']"));
	Select m=new Select(Month);
	m.selectByVisibleText("December");
	
	Thread.sleep(1000);
	List<WebElement>days=driver.findElements(By.xpath("//table//tr//td//a"));
	for(WebElement day:days) {
	if(day.getText().equals("15")) {
	day.click();	
	}
	}
	}
}
