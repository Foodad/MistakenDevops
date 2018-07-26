package PNCGroup.PNCArtifact;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JavaScriptExecutor {
	static WebDriver driver;
	public static int counter = 1;
	
	@Test
	public void snapshot() throws InterruptedException, IOException {
		
		takescreenshot();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript("alert('Hello')");
		Thread.sleep(2000);
		j.executeScript("window.scroll(0,1000)");
		//j.executeScript("history.go(0)");*/
		
		
		takescreenshot();
	}
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Wiki");
		driver.manage().window().maximize();
	}
	
	public static void takescreenshot() throws IOException {
			
			String sysTime = getSysTime();
			File dest = new File("C:\\Users\\pdc4-training.pdc4\\Desktop\\Sample\\screenshot"+sysTime+".jpg");
			TakesScreenshot t = (TakesScreenshot)driver;
			File f = t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, dest);
			counter=counter+1;
	}
	
	public static String getSysTime() {
		
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();

		 // Now format the date
		 String date1= dateFormat.format(date);

		 // Print the Date
		 System.out.println("Current time is " +date1);
		 String date2 = date1.replaceAll(":", "");
		 System.out.println(date2);
		 return date2;

	}

}
