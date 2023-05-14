package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>listWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		String title1= driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]))//a[@class='linktext']")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String> windowHandles0 = new ArrayList<String>(windowHandles1);
        driver.switchTo().window(windowHandles0.get(0));
        String title2 = driver.getTitle();
        System.out.println(title2);
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> lstwindowHandles2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(lstwindowHandles2.get(1));
		String ptitle2 = driver.getTitle();
		System.out.println(ptitle2);
	    driver.findElement(By.xpath("//div[contains(@class,'inner x-grid3-col-partyId')]/a[@class='linktext']")).click();
	    Set<String> windowHandles3 = driver.getWindowHandles();
	    List<String> lstwindowHandles3=new ArrayList<String>(windowHandles3);
	    driver.switchTo().window(lstwindowHandles3.get(0));
	    String ptitle3 = driver.getTitle();
	    System.out.println(ptitle3);
	    driver.findElement(By.xpath("(//a[text()='Merge'])")).click();
	    Alert alert = driver.switchTo().alert();
	    alert.accept();
	    System.out.println(driver.getTitle());
	    if (driver.getTitle().contains("Merge Contacts")) {
	    	System.out.println("You are on the right page");
	    }
	    else {
	    	System.out.println("You You are on the Wrong page");
	    }
	    
		
	}

}
