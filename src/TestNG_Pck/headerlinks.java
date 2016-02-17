package TestNG_Pck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

//import com.thoughtworks.selenium.webdriven.commands.GetText;

public class headerlinks {
	public WebDriver d;
	
  @Test
  public void f() throws Exception {
	  Thread.sleep(5000);
	  WebElement header=d.findElement(By.id("sc_hdu"));
	  List<WebElement> links=header.findElements(By.tagName("a"));
	  System.out.println(links.size());
	  
	  for(int i=0;i<links.size();i++)
		 
		 System.out.println(links.get(i).getText());
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  d=new FirefoxDriver();
	  d.get("http://bing.com");
  }

  @AfterTest
  public void afterTest() {
	  d.quit();
  }

}
