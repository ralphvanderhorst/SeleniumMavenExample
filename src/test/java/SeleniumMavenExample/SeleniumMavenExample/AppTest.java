package SeleniumMavenExample.SeleniumMavenExample;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



/**
 * Unit test for simple App.
 */
public class AppTest{

	  WebDriver driver = new FirefoxDriver();
	  @Before
	  public void beforetest(){
		  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//geckodriver");
		  driver.manage().window().maximize();
		  
		  driver.get("http://www.ikzoekopdrachtgevers.nl/TestingBlog/2016/08/14/selenium-installation/");
	  }
	  @After
	  public void aftertest(){
		  driver.close();
		  driver.quit();
	  }
	  
	  @Test
	  public void test(){
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
	      Assert.assertEquals("Selenium webdriver Installation",driver.findElement(By.className("entry-title")).getText());
		
		  
		  
	  }

	  
	  @Test
	  public void test2(){
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  String  gettitle = driver.findElement(By.className("entry-title")).getText();
		  Assert.assertEquals("Selenium webdriver Installationl",driver.findElement(By.className("entry-title")).getText());
		  System.out.print(gettitle);
		  
		  
	  }

}
