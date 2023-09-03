package My_First_Automation_Code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class My_First_Automation_Code {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		driver.quit();
		
		
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.get("https://rediff.com");
		driver1.quit();
		
		WebDriver driver2 = new SafariDriver();
		driver2.manage().window().maximize();
		driver2.get("https://youtube.com");
		driver2.quit();

	}

}
