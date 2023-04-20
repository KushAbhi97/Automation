import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIsEnabled {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean button = driver.findElement(By.xpath("//button")).isEnabled();

		if (button==true) {
			System.out.println("Button is Enable and is pass");
		}
		else {
			System.out.println("Button is Disabled and is fail");
		}
		driver.quit();

	}

}
