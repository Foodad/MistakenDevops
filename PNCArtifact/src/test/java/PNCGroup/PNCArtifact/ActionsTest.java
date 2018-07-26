package PNCGroup.PNCArtifact;

import org.testng.annotations.Test;


import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionsTest {

	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()   {
		
		
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.timesjobs.com/candidate/register.html");
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException,AWTException {
		
		Robot r =  new Robot();
		//Actions a = new Actions(driver);
		
		setClipboardData("C:\\Users\\pdc4-training.pdc4\\Desktop\\Explicitwait.docx");
		//WebElement email = driver.findElement(By.id("emailAdd"));
		//a.moveToElement(email).keyDown(email,Keys.SHIFT).sendKeys("testabcd@accenture.com").build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.id("resumeFile_basic")).click();
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void setClipboardData(String Data) {
		
		StringSelection strSelection =  new StringSelection(Data);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection,null);
	}


}
