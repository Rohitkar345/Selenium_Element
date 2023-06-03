package ScrrenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screen extends Scroll{
	
	public static void Screen(String Name) throws IOException {
	
	File sc=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	FileHandler.copy(sc,new File("./target/"+Name+".png"));
	}
    
	
}
