package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAdvancedInteractions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//mouse hover action
		//locate the element and return as a WebElement need use mouse hover
		WebElement brand = driver.findElement(By.xpath("//a[contains(text(),'brands')]"));
		//instantiate the Action class 
		Actions builder = new Actions(driver);
	    builder.moveToElement(brand).perform();
	    String title = driver.getTitle();
	    System.out.println("Title of this page:" +title); 
	    
	    

	}

}
