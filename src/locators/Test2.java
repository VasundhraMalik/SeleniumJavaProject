package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.amazon.com/");
     driver.findElement(By.linkText("Gift Cards")).click();
     
     
	}

}
