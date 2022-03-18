package dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoapp.skillrary.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     WebElement ele = driver.findElement(By.id("cars"));
	     
	     Select s= new Select(ele);
	     s.selectByIndex(3);
	     s.selectByValue("");
	     s.selectByVisibleText("");
	     
	     System.out.println(s.isMultiple());
	     
	     if(s.isMultiple())
	     {
	    	s.deselectAll(); 
	     }
	     
	     Thread.sleep(3000);
	     driver.close();
	     
	     }

}
