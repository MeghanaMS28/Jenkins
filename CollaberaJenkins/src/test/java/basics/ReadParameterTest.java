package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadParameterTest {

	@Test
	public void data() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println( System.getProperty("bname"));
		driver.get(System.getProperty("url"));
	}
}
