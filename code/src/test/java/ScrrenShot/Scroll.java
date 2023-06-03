package ScrrenShot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll {
     
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver"
    ,"C:\\Users\\JOHN\\eclipse-workspace\\newWorlspace\\code\\target\\chromedriver.exe");
    ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
    driver=new ChromeDriver(co);
    driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("window.scrollTo(0,1076)");
	Screen.Screen("rohit");
	
	
	
	}
}
