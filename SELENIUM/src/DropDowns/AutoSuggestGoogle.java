package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestGoogle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	
		search.sendKeys("java Tutorial");
		
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]//span"));
	
		System.out.println("Size of Auto Suggestion: "+list.size());
	
		for(WebElement item:list)
		{
			if(item.getText().contains("pdf"))
			{
				item.click();
				break;
			}
		}
	
		Thread.sleep(5000);
	
		driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
