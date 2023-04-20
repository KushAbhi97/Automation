import org.openqa.selenium.chrome.ChromeDriver;

public class Song {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	driver.navigate().back();
		
	driver.navigate().to("https://www.youtube.com");
			
	driver.navigate().forward();
		
	driver.navigate().refresh();
		
	driver.get("https://youtu.be/21YEXYIKpF0");
	}

}
