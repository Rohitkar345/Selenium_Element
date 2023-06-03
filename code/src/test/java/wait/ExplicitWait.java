package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver"
	,"C:\\Users\\JOHN\\eclipse-workspace\\newWorlspace\\code\\target\\chromedriver.exe");
    ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebDriverWait wait=new WebDriverWait (driver,Duration.ofSeconds(10));
	
	driver.findElement(By.xpath("//button[text()='Click me, to Open an alert after 5 seconds']")).click();
	wait.until(ExpectedConditions.alertIsPresent())	;
	driver.switchTo().alert().accept();
	}
}
