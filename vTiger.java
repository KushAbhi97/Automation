import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class vTiger {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		WebElement res = driver.findElement(By.partialLinkText("Resources"));
		Actions a =new Actions(driver);
		a.moveToElement(res).perform();
		driver.findElement(By.partialLinkText("Customers")).click();
		WebElement log = driver.findElement(By.id("loginspan"));
		a.doubleClick(log).perform();
		
		if (condition) {
			
		}
		
		
		
		
		driver.quit();
		
	}

}
