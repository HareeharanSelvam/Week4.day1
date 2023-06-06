package week4.day2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrollAction {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Locate the Element and return it as WebElement
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[text()='OnePlus 11 5G (Eternal Green, 8GB RAM, 128GB Storage)']")).click();
		//handle the window 
		Set<String> windowHandles = driver.getWindowHandles();
		//convert Set into List
		List<String> listWindow = new ArrayList<String>(windowHandles);
		//Switch to other windows
		driver.switchTo().window(listWindow.get(1));
		//scroll the particular webelement
		WebElement scroll = driver.findElement(By.xpath("//a[text()='See more product details']"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(scroll).perform();
		//get screen shot
		File source = driver.getScreenshotAs(OutputType.FILE);
		//create a folder to save the file
		File dest = new File("./Snap/Amazon.png");
		//Merge the files 
		FileUtils.copyFile(source, dest);
		//get the title of the page
		 String title = driver.getTitle();
		 System.out.println("The title of this Page:" +title);
		
		
		
	}

}
