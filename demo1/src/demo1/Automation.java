package demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chrome driver\\chromedriver.exe");
		
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.youtube.com");
		
	
	System.out.println("hi");
	}

}
