package toolQA;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserwindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		//System.out.println("home");
		
		/*
		String n  = Keys.chord(Keys.CONTROL,Keys.ENTER);
		driver.findElement(By.id("tabButton")).sendKeys(n);
		Thread.sleep(5000);
		
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(w);
		driver.switchTo().window(w.get(1));
		System.out.println(w.get(1));
		System.out.println("new tab title: "+driver.getPageSource());
		driver.switchTo().window(w.get(0));
		System.out.println(w.get(0));
		System.out.println("first tab title: "+driver.getTitle());
		*/
		
		String n = Keys.chord(Keys.CONTROL, Keys.ENTER);
		driver.findElement(By.id("messageWindowButton")).sendKeys(n);
		Thread.sleep(5000);
		
		ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(w);
		
		System.out.println(driver.switchTo().window(w.get(1)));
		
		System.out.println(driver.getPageSource());
		
		
		
		
		
		
		
		
		

	}

}
