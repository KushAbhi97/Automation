import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean button = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();

		if (button==true) {
			System.out.println("CheckBox is ticked");
		}
		else {
			System.out.println("CheckBox is Unticked");
		}
		driver.quit();

	}

}
