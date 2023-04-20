import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bbc {
	static {
		System.setProperty("webdriver.chrome.driver",
				"./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> news = driver.findElements(By.xpath("//span[@class='top-list-item__bullet']/../h3"));
		int count = news.size();

		for(int i=0;i<count;i++)
		{
			String text = news.get(i).getText();
			System.out.println(">"+text);
		}
		driver.close();
	}
}
