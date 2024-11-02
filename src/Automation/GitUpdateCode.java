package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitUpdateCode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","chromedriver_v93.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.brainyquote.com/authors");

	}

}
