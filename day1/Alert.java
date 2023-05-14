package week4.day1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Alert(Simple Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = (Alert) driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		System.out.println(driver.findElement(By.id("simple_result")).getText());
		//Alert(Conform Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert alert2 = (Alert) driver.switchTo().alert();
		String text2 = alert2.getText();
		System.out.println(text2);
		alert2.accept();
		System.out.println(driver.findElement(By.id("result")).getText());
		//sweet Alert (Simple dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		String text3 = driver.findElement(By.xpath("//div[contains(@class,'ui-widget-content')]/p")).getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		//Sweet modal dialog 
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='m-0']")).getText());
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		//Alert (Prompt Dialog)
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert4 = (Alert) driver.switchTo().alert();
		String text4 = alert4.getText();
		System.out.println(text4);
		alert4.sendKeys("Hareeharan");
		alert4.accept();
		System.out.println(driver.findElement(By.id("confirm_result")).getText());
		//Sweet Alert (Confirmation)
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Are you sure you')]")).getText());
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
//Minimize and Maximize
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		System.out.println(driver.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText());
		driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();
	}

	private void sendKeys(String string) {
		
	}

	private void accept() {
		
	}

	private String getText() {
		
		return null;
	}

}
