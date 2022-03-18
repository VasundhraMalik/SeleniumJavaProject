package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws IOException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     
     driver.navigate().to("https://www.flipkart.com/");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
     //typecasting
     TakesScreenshot ts=(TakesScreenshot)driver;
     //
     File src = ts.getScreenshotAs(OutputType.FILE);
     //
     File dest=new File("./photo/flipkart.png");
     
     FileUtils.copyFile(src, dest);
     
     driver.close();
     
		 
	}

}
