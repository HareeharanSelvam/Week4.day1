package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement findElement = driver.findElement(By.xpath("//span[@class='catText']"));
		 Actions builder = new Actions (driver);
		 builder.moveToElement(findElement).perform();
		 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		  File dest = new File("./Snap/frame.png");
		  FileUtils.copyFile(screenshotAs, dest);
	}

}
