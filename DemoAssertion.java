import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAssertion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@Test
	public void verifyTitle() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		String eTilte = "Soogle";
		String aTitle = driver.getTitle();
		
		if (aTitle.equals(eTilte)) {
			System.out.println("Pass");
			
		} 
		else {
		
			System.out.println("Fail");

		}
		driver.close();
		
	}

}
