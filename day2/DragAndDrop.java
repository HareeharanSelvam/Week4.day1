package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.switchTo().frame(0);
        //Find element
        WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement desc = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions builder=new Actions(driver);
        builder.dragAndDrop(source, desc).perform();

	}

}
