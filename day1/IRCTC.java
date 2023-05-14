package week4.day1;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class IRCTC {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
	    driver.findElement(By.linkText(" FLIGHTS ")).click();
	    Set<String> windowHandles = driver.getWindowHandles();
	    //convert set into list
	    List<String> lstWindow=new ArrayList<String>(windowHandles);
	    driver.switchTo().window(lstWindow.get(1));
	    System.out.println(driver.getTitle());
	    driver.close();
	    driver.switchTo().window(lstWindow.get(0));
	    System.out.println(driver.getTitle());
	}

}
