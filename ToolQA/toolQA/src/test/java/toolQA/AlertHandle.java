package toolQA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chrome driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/alerts");
		//System.out.println("on Alert page");
		
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(5000);
//		
//		driver.switchTo().alert().accept();
//		
//		try{
//			
//			driver.findElement(By.id("timerAlertButton")).click();
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//            wait.until(ExpectedConditions.alertIsPresent());
//
//            Alert alert = driver.switchTo().alert();
//           // System.out.println(“Alert box text ” + alert.getText());
//            alert.accept();
//
//} catch (NoAlertPresentException noAlert) {
//noAlert.getMessage();
//}
//
//	}
		
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(5000);
//		driver.switchTo().alert().dismiss();
		
//		driver.findElement(By.id("promtButton")).click();
//		Alert alert =  driver.switchTo().alert();
//		alert.sendKeys("Ameya");
//		alert.accept();
		
		
	}
}
