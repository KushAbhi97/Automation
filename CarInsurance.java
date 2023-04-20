import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CarInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.className("form-control")).sendKeys("123");
		Thread.sleep(3000);
		driver.findElement(By.id("dob")).click();
		WebElement mon =
		driver.findElement(By.className("ui-datepicker-month"));
		Select s = new Select(mon);
		s.selectByValue("6");
		Thread.sleep(3000);

		WebElement year =
		driver.findElement(By.className("ui-datepicker-year"));
		Select s1 = new Select(year);
		s1.selectByValue("1997");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[.='25']")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='submit-login']")).click();
		Thread.sleep(3000);


		
		boolean text = driver.findElement(By.xpath("(//span[@class='ErrorField'])[1]")).isDisplayed();
		
		if (text==true) {
			System.out.println("Text printed");			
		}
		else {
			System.out.println("Text not printed");
		}
		driver.close();
	}
	

}
