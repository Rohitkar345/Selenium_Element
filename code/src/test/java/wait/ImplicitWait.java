package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImplicitWait {
   
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
	    ,"C:\\Users\\JOHN\\eclipse-workspace\\newWorlspace\\code\\target\\chromedriver.exe");
	     ChromeOptions co=new ChromeOptions();
		 co.addArguments("--remote-allow-origins=*");
		 WebDriver driver=new ChromeDriver(co);
		 driver.get("https://chercher.tech/practice/implicit-wait-example");
		 driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		 int i=1;
		 while(i>0) {
		 driver.findElement(By.xpath("//div[@id='q']//input["+i+"]")).click();
		 i++;
		 }
	}
}
