package Restassured.JenkinProjectTorun;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class Homepage
{
	WebDriver driver = new ChromeDriver();
  @Test
public void GotoAppurl()
{
	
	driver.get("https://parabank.parasoft.com/parabank/index.htm;jsessionid=4B832E5446EDEE9C45613969A5899692 ");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	System.out.println("NavigatetoParabank");
	
	
}
  @Test
  public void customerLogin()
  {
	 WebElement textuid = driver.findElement(By.cssSelector("input[name='username']"));
	 textuid.sendKeys("admin");
	 WebElement textpwd = driver.findElement(By.cssSelector("input[name='password']"));
	 textpwd.sendKeys("admin");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 WebElement btnlogin = driver.findElement(By.cssSelector("input[value='Log In']"));
	 btnlogin.click();
	 System.out.println("Hello done");
	 
	 driver.close();
	 
}
}

			
			