import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAlignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		int x1 =driver.findElement(By.id("username")).getLocation().getX();
		int x2 =driver.findElement(By.id("username")).getLocation().getX();
		if (x1==x2) {
			System.out.println("UN & PW textbox are properly aligned & pass");
		}
		else {
			System.out.println("UN & PW textbox are not properly aligned & fail");
		}
		driver.close();

	}

}
