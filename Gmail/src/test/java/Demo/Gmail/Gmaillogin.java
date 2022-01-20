package Demo.Gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.By;

public class Gmaillogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// URL launch
		driver.get("https://accounts.google.com/signin");
		// identify email
		WebElement l = driver.findElement(By.name("identifier"));
		l.sendKeys("abc@gmail.com");
		WebElement b = driver.findElement(By.className("VfPpkd-LgbsSe"));
		b.click();
		// identify password
		WebElement p = driver.findElement(By.name("password"));
		p.sendKeys("123456");
		b.click();
		// close browser
		driver.close();
	}
}
