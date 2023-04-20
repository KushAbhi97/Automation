import org.openqa.selenium.chrome.ChromeDriver;

public class UrlWithoutGet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().to("https://www.youtube.com");
		driver.navigate().back();

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);	
		driver.close();
	}

}
