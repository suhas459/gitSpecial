package gitSpecial;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		Thread.sleep(1500);
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Suhas");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = RandomString.make(4);
		File f= new File ("D:\\New folder\\screenshot\\vel"+random+".jpg" );
		
		FileHandler.copy(src, f);
		
		
		
		
		
		
		Thread.sleep(7500);
driver.close();

	}

}
