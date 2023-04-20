import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.switchTo().alert().dismiss();
		boolean text = driver.findElement(By.xpath("//p[text()='You Pressed Cancel']")).isDisplayed();
		
		if(text==true) {
			System.out.println("Text Cancel is displayed");
			}
		else {
			System.out.println("Text Cancel is not displayed");
		}
		driver.close();
	}

}
