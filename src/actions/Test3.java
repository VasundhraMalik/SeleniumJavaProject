package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) {
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://luxire.com/");
    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    
    
    WebDriverWait w=new WebDriverWait(driver,50);

    WebElement ele = driver.findElement(By.xpath("//a[text()='Account']"));
    w.until(ExpectedConditions.visibilityOf(ele));
      Actions a=new Actions(driver);
      a.moveToElement(ele);
      
      WebDriverWait wait=new WebDriverWait(driver,50);
      WebElement ele1= driver.findElement(By.id("customer_login_link"));
      wait.until(ExpectedConditions.visibilityOf(ele1)).click();
      
      driver.findElement(By.id("CustomerEmail")).sendKeys("vasu@mailinator.com");
      
      
	}

}

