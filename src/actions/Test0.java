package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test0 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     //driver.manage().window().maximize();
	     driver.get("https://www.myntra.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     WebElement ele = driver.findElement(By.xpath("//a[@data-group='beauty']"));
	     Actions a= new Actions(driver);
	     a.moveToElement(ele).perform();
	     WebDriverWait wait=new WebDriverWait(driver,100);
	     
	     WebElement ele1 = driver.findElement(By.xpath("//a[text()='Lipstick']"));
	     wait.until(ExpectedConditions.visibilityOf(ele1)).click();
	     
	     driver.close();
	    
}
}