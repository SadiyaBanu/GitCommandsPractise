package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrainyQuote_Develop
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver_v93.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.brainyquote.com/authors");
		
		//Get all the Author name
		List<WebElement> authorName = driver.findElements(By.xpath("//a[@class='bq_on_link_cl']/span"));
		authorName.stream().forEach(a->System.out.println(a.getText()));
		
		//Get the quote of Albert Einstein
		String auothor = "Abraham Lincoln";
		driver.findElement(By.linkText(auothor)).click();    // click author name
		List<WebElement> pages = driver.findElements(By.xpath("//a[@class='page-link']"));    // no of pages
		int noOfPages = pages.size();
		for(int i = 1;i < noOfPages - 1;i++)
		{
			if(i >= 2)
			{	
				driver.findElement(By.xpath("//li[@class='page-item']/a[contains(text(),"+i+")]")).click();
		      	List<WebElement> quote = driver.findElements(By.xpath("//a[@title='view quote']/div"));    //get all the quote
			    quote.stream().forEach(a->System.out.println(a.getText()));
			    System.out.println(quote.size());
			}
			else
			{
				List<WebElement> quote = driver.findElements(By.xpath("//a[@title='view quote']/div"));    //get all the quote
			    quote.stream().forEach(a->System.out.println(a.getText()));
			    System.out.println(quote.size());
				
			}
		}
		
	}

}
