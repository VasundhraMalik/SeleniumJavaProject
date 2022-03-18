package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://validation-admin.blueribbonbags.com/Login");
     driver.findElement(By.id("txtLogin")).sendKeys("dsadmin");
     driver.findElement(By.name("Password")).sendKeys("Test@123");
     driver.findElement(By.xpath("//span[@data-translation=\"Login\"]")).click();
     
     String title = driver.getTitle();
     System.out.println(title);
     
     String url = driver.getCurrentUrl();
     System.out.println(url);
     
     if(url.equals("http://validation-admin.blueribbonbags.com/ServiceLookup"))
     {
    	 System.out.println("Pass: Home Page is displayed");
     }
     else
     {
    	System.out.println("Fail: Home Page is not displayed");
     }
     
     
     driver.close();
     
	}

}
