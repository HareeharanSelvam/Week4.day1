package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/");
		//identify the table
	      WebElement table = driver.findElement (By.xpath("//div[contains(@class,'ui-panel')]/table"));
		//row count count how many rows are present in table using tr we locate row
	      List<WebElement> rowCount = table.findElements(By.tagName("tr"));
	      System.out.println("Row Counts:" +rowCount.size());
	      //column count columns inside the table and with the help of row we locate the column
	      //using td or th we can locate the column
	      List<WebElement> columnCount= table.findElements(By.tagName("td"));
	      System.out.println("Column Counts:" +columnCount.size());
	      //print one particular row
	      System.out.println("particular row:" +rowCount.get(1).getText());
	      //print one particular column
	      System.out.println("particular column:" +columnCount.get(2).getText());
	      //print row USA of the table (5)
	      System.out.println("Row USA:" +rowCount.get(4).getText());
	      //print USA total by using row and column
	      System.out.println("USA Total:" +columnCount.get(1).getText());
	      //print column usa
	      //System.out.println("Usa col:" +columnCount.get(0).getText());
	      //print the row and column
	       String text = driver.findElement(By.xpath("//div[contains(@class,'ui-panel')]/table//tr[4]/td[1]")).getText();
	      System.out.println(text);
	      /* to print entire row and column we can concate each other in for loop
	       * //div[contains(@class,'ui-panel')]/table//tr["+i+"]/td["+j+"] so inside for loop we can use this
	       */
	      for (int i = 0; i < rowCount.size(); i++) {
	    	  System.out.println(rowCount.get(i).getText());
		}
	      for (int j = 0; j < columnCount.size(); j++) {
	    	  System.out.println(columnCount.get(j).getText());
			
		}
			
		}

	}


