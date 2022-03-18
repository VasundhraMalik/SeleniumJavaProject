package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test4 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoapp.skillrary.com/index.php");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     WebElement ele = driver.findElement(By.name("addresstype"));
	     Select s=new Select(ele);
	     s.selectByValue("category.php?category=testing");
	     
	    driver.findElement(By.xpath("(//a[@href='product.php?product=cucumber'])[2]")).click();
	    
	    WebElement ele1 = driver.findElement(By.id("add"));
	     Actions a=new Actions(driver);
	       a.doubleClick(ele1).perform();
	       
	      driver.close(); 
	   
	     
	     
	     

}
}