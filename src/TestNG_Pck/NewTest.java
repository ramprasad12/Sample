package TestNG_Pck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	public WebDriver d;
	
  @Test
  public void f() throws Exception {
	  Thread.sleep(10000);
	  List<WebElement> links=d.findElements(By.tagName("a"));
	  Thread.sleep(10000);
	  System.out.println(links.size());
	  
	  for(int i=0;i<links.size();i++)
		  System.out.println(links.get(i).getText());
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  d=new FirefoxDriver();
	  d.get("http://hdfcbank.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
