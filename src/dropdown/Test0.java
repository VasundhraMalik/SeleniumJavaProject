package dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	      WebElement ele = driver.findElement(By.id("searchDropdownBox"));
	      
	      Select s = new Select(ele);
	      s.selectByIndex(3);
	      s.selectByValue("search-alias=digital-music");
	      s.selectByVisibleText("Automotive");
	      
	      List<WebElement> opt = s.getOptions();
	      System.out.println(opt.size());
	      
	      for(WebElement b: opt)
	      {
	    	  System.out.println(b.getText());
	      }
	      
	      
	      driver.close();
	      
	}

}
