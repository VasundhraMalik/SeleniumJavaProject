package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {

	public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
		     driver.manage().window().maximize();
		     driver.get("https://demoapp.skillrary.com/index.php");
		     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		     
		       WebElement ele = driver.findElement(By.id("course"));
		       Actions a= new Actions(driver);
		       a.moveToElement(ele).perform();
		       
		       driver.findElement(By.linkText("Selenium Training")).click();
		       
		       WebElement ele1 = driver.findElement(By.id("add"));
		       a.doubleClick(ele1).perform();
		       
		      driver.close(); 
		     
	}

}

