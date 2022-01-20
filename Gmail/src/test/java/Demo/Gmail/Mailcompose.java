package Demo.Gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mailcompose {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		// Send email address
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("User mail id");
		WebElement l = driver.findElement(By.name("identifier"));
		l.sendKeys("abc@gmail.com");
		WebElement b = driver.findElement(By.className("VfPpkd-LgbsSe"));
		b.click();
		// identify password
		WebElement p = driver.findElement(By.name("password"));
		p.sendKeys("123456");
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		b.click();

		// Click on compose button
		driver.findElement(By.xpath("//div[text()='Compose']")).click();

		// Enter the sender mail id
		driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("Sender e-mail id");
		// Enter subject to the mail
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium script");
		driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Selenium script to send mail");

		// Attach the full path of file
		driver.findElement(By.xpath("//input[@name='Filedata']")).sendKeys("D:\\testing.txt");
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}
}
