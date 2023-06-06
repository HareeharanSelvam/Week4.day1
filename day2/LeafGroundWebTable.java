package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundWebTable {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//i[@class='pi pi-table layout-menuitem-icon']")).click();
	    driver.findElement(By.xpath("//i[@class='pi pi-fw pi-table layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//table//tr[5]//td[3]")).click();
		String pageSource = driver.getPageSource();
		System.out.println(driver.getTitle()); 		

	}

}
