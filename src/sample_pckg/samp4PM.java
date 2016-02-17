package sample_pckg;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class samp4PM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FirefoxDriver g=new FirefoxDriver();
		g.navigate().to("http://spicejet.com/");
		g.manage().window().maximize();
		
		g.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		g.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		g.findElement(By.linkText("Hyderabad (HYD)")).click();
		
		Thread.sleep(4000);
		g.findElement(By.linkText("Bengaluru (BLR)")).click();
		
		Thread.sleep(5000);
		
		g.findElement(By.linkText("27")).click();
		
		new Select(g.findElement(By.id("ctl00_mainContent_ddl_Adult"))).selectByVisibleText("3 Adults");
		new Select(g.findElement(By.id("ctl00_mainContent_ddl_Child"))).selectByVisibleText("1 Child");
		
		g.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		

	}

}
