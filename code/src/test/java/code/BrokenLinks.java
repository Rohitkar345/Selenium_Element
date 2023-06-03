package code;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrokenLinks {

public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver"
    ,"C:\\Users\\JOHN\\eclipse-workspace\\newWorlspace\\code\\target\\chromedriver.exe");
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(co);
	driver.get("https://www.foundit.in/");
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	int count=0;
	int count1=0;
	List <WebElement>Links=driver.findElements(By.tagName("a"));
	System.out.println("NUMBER OF LINKS="+Links.size());
	
	for(int i=0; i<Links.size(); i++) {
		
	WebElement link=Links.get(i);
	
    String URL=link.getAttribute("href");
    
    URL url=new URL(URL);
    
    HttpURLConnection http=(HttpURLConnection) url.openConnection();
    
    Thread.sleep(2000);
    
    http.connect();
    
    int StatusCode=http.getResponseCode();
    
    if(StatusCode>=400) {
    count++;	
    System.out.println(URL+"-"+"Link Is Broken");	
    }
    else {
    count1++;	
    System.out.println(URL+"-"+"Link Is Not Broken");	
    }
	}
	System.out.println("No Of Broken Link="+count);
	System.out.println("No Of Not Broken Link="+count1);
	}
}
