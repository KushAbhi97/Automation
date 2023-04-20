import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EqualHeightAndWidth {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement lgBtn=driver.findElement(By.name("login"));
		int height = lgBtn.getSize().getHeight();
		int width = lgBtn.getSize().getWidth();
		
		if (height==width) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not Equal");
		}
		driver.close();

	}

}
