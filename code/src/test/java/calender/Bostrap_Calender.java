package calender;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bostrap_Calender {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver"
	,"C:\\Users\\JOHN\\eclipse-workspace\\newWorlspace\\code\\target\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();	
	
	driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
	
	int i=0;
	while(i==0) {
	WebElement Element=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));	
	if(!(Element.getText().equals("June 1998"))) {
	driver.findElement(By.xpath("//span[text()='Prev']")).click();	
	}
	else {
	break;	
	}
	}
	driver.findElement(By.xpath("//a[text()='20']")).click();	
	}
}
