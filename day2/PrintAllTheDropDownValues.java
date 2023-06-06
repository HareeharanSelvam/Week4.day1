package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintAllTheDropDownValues {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the element using xpath locator
		//find element returns the webelement 
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		//here we instiatizating those local variable as here select is a library package
		Select tool = new Select(dropdown);
		//here we use instance variable with getOptions() and the findelements returns List<webelement>
		List<WebElement> options = tool.getOptions(); // now the options is the List name 
		for (int i = 0; i <  options.size();i++) {
			System.out.println(options.get(i).getText());
			
		}
		
	}

}
