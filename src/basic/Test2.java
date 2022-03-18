package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
        //open the browser
		WebDriver driver= new ChromeDriver();
        //Enter the url
		driver.get("https://www.amazon.in/");
		//Get the title
		System.out.println(driver.getTitle());
		//Get the URL
		System.out.println(driver.getCurrentUrl());
	     //close the application
		driver.close();
	}
	
}
