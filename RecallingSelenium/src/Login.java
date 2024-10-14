import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

	public static WebDriver driver;

	public static void signin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\sqa\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("http://www.teamwork.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Login")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginemail")).click();
		driver.findElement(By.id("loginemail")).sendKeys("fallenstudent99@gmail.com");
		driver.findElement(By.id("loginpassword")).click();
		driver.findElement(By.id("loginpassword")).sendKeys("sqaproject99");
		driver.findElement(By.xpath("/html/body/div/div[1]/section/div[2]/div/div/div/div/form/div[2]/button/span")).click();
		boolean exists;
		try {
			exists = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/section/div[2]/div/div/div/div/div[1]/h1")).isDisplayed();
		} catch (Exception e) {
			exists = false;
		}
		if (exists)
			System.out.print("Log in failed\n");
		else
			System.out.print("Logged in successfully\n");
		driver.findElement(By.xpath("/html/body/div/div[1]/section/div[2]/div/div[2]/div/a[1]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"box1\"]/a")).click();
		driver.switchTo().defaultContent();

	}
}
