import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPrice {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone 14pro max"+ Keys.ENTER);
				
		List<WebElement> proName =driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		List<WebElement> proprice =driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		int count = proName.size();		
		
		for(int i=0;i<count;i++) {
			
			String text = proName.get(i).getText();
			String text1 = proprice.get(i).getText();
			
			System.out.println(">"+text+ "--->"+ text1);
		}
		driver.close();
	}
}

