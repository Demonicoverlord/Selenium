import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PostMessage extends Login{
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		signin();
		Thread.sleep(2000);
		driver = Login.driver;
		Delete_Message(driver);
	}

	/*public static void Edit_Message(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//*[@id=\"mainNav\"]/nav/ul/li[7]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div[3]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/div/button"))).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/app/projects/1115405/messages']")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			String searchMessages = "Idk";
			String Title = "Idk";
			String Description = "How";
			java.util.List<WebElement> matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
			Thread.sleep(2000);
			int numOfElements= matchingElements.size();
			if (searchMessages!=Title) {
				for (int i = 0; i < numOfElements; i++) {
					matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
					WebElement edit = matchingElements.get(0);
					edit.click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[text()='Edit Message']")).click();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[1]/input")).click();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[1]/input")).clear();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[1]/input")).sendKeys(Title);
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).click();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).clear();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).sendKeys(Description);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
					driver.navigate().back();
					Thread.sleep(4000);
					driver.switchTo().frame(0);
					matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
				}
				System.out.print("Editing is over\n");
				java.util.List<WebElement> matchingElementsAfterEditing = driver.findElements(By.xpath("//a[text()='" + Title + "']"));
				if (matchingElementsAfterEditing.size() > 0)
					System.out.print(matchingElementsAfterEditing.size() + " have not been edited");
				else
					System.out.print("Editing failed");
			}
			else if (searchMessages==Title || Title==""){
				for (int i = 0; i < numOfElements; i++) {
					matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
					WebElement edit = matchingElements.get(i);
					edit.click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[text()='Edit Message']")).click();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).click();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).clear();
					driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).sendKeys(Description);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
					driver.navigate().back();
					Thread.sleep(4000);
					driver.switchTo().frame(0);
					matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
				}
				System.out.print("Editing is over\n");
				java.util.List<WebElement> matchingElementsAfterEditing = driver.findElements(By.xpath("//a[text()='" + Title + "']"));
				if (matchingElementsAfterEditing.size() > 0)
					System.out.print(matchingElementsAfterEditing.size() + " have been edited");
				else
					System.out.print("Editing failed");
			}
			//Finally you must Close and Quit the Browser
			//driver.close();
			//driver.quit();
		}catch (Exception e){System.out.print(e);}
	}*/

	/*public static void Edit_Message(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//*[@id=\"mainNav\"]/nav/ul/li[7]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div[3]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/div/button"))).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/app/projects/1115405/messages']")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			String searchMessages = "The dark Lords";
			String Description = "Who decided";
			java.util.List<WebElement> matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
			Thread.sleep(2000);
			for (int i = 0; i < matchingElements.size();) {
				matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
				matchingElements.get(i).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Edit Message']")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).click();
				driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).clear();
				driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).sendKeys(Description);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
				driver.navigate().back();
				Thread.sleep(4000);
				driver.switchTo().frame(0);
				matchingElements = driver.findElements(By.xpath("//a[text()='" + searchMessages + "']"));
			}
			System.out.print("Editing is over\n");
			//driver.close();
			//driver.quit();
		}catch (Exception e){System.out.print(e);}
	}*/

	public static void Post_Message(WebDriver driver) throws InterruptedException {
		try{
			String Title = "Idk";
			String Description = "Idk";
			driver.findElement(By.xpath("//*[@id=\"mainNav\"]/nav/ul/li[7]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div[3]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/div/button"))).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/app/projects/1115405/messages']")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			java.util.List<WebElement> matchingElements = driver.findElements(By.xpath("//a[text()='" + Title + "']"));
			driver.findElement(By.xpath("//button[text()='Add a message']")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[3]/iframe")));
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/div[1]/form/div[1]/div[1]/div/input")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/div[1]/form/div[1]/div[1]/div/input")).sendKeys(Title);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/div[1]/form/div[1]/div[2]/div/div[1]/div[2]")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/div[1]/form/div[1]/div[2]/div/div[1]/div[2]")).sendKeys(Description);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Post Message']")).click();
			Thread.sleep(2000);
			java.util.List<WebElement> doneMatchingElements = driver.findElements(By.xpath("//a[text()='" + Title + "']"));
			if (doneMatchingElements.size()>matchingElements.size())
				System.out.print("Message successfully Posted");
			else
				System.out.print("Failed to Post message");
			//driver.close();
			//driver.quit();
		}catch (Exception e){System.out.print(e);}
	}
	public static void Edit_Message(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(By.xpath("//*[@id=\"mainNav\"]/nav/ul/li[7]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div[3]/div/a")).click();
			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/div/button"))).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/app/projects/1115405/messages']")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/section/div[1]/div[7]/div/div[2]/div[1]/div/a")).click();
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/section/section/header/div/div[2]/button[4]")).click();
			driver.switchTo().defaultContent();
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[3]/iframe")));
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).clear();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/section/main/div[1]/div[1]/div/div/div[1]/section/section/div[1]/div/div/div[2]/div/form/div[2]/div[1]/div[1]/div[2]")).sendKeys("Never mind, we do not need to meet anymore.");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//button[text()='Save Changes']")).click();
			boolean confirmation = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/section/section/div[1]/div/div[1]/div[2]/span/div/div")).getText().contains("Never mind, we do not need to meet anymore.");

			if (confirmation == true)
				System.out.println("Test successful!");
			else
				System.out.println("Test failed!");
			//driver.close();
			//driver.quit();
		} catch (Exception e) {
			System.out.print(e);
		}
	}
	public static void Delete_Message(WebDriver driver) throws InterruptedException {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"mainNav\"]/nav/ul/li[7]/div/a")).click();

			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div/div[2]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div[3]/div/a")).click();

			Thread.sleep(1000);
			driver.switchTo().defaultContent();
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/div/button"))).perform();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@href='/app/projects/1115405/messages']")).click();
			Thread.sleep(1000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/section/div[1]/div[1]/div/div[3]/div/div[2]/div/button")).click();
			driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div/div[3]/div[2]/div/div[2]/div[1]/div/div[1]/ul/li[3]/a")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"ModalContainer\"]/div/section/span/div/div/section/footer/button[2]/span")).click();
			boolean confirmation = driver.findElement(By.xpath("//*[@id=\"project\"]/div[2]/div/div/div[3]/div/div/div")).isDisplayed();
			if (confirmation == true)
				System.out.println("Test successful");
			else
				System.out.println("Test failed");
			//driver.close();
			//driver.quit();
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
