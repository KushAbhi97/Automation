import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String text1=driver.findElement(By.id("toPasswordRecoveryPageLink")).getText();
		String text2=driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		String text3=driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		System.out.println(text1);
		System.out.println(text2);
		System.out.println(text3);
		driver.quit();

	}

}
