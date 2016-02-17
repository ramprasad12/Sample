package sample_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clear {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FirefoxDriver d=new FirefoxDriver();
		d.navigate().to("http://google.com");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]")).sendKeys("qtp");
		Thread.sleep(6000);
		
		d.findElement(By.name("btnG")).click();
		
		d.findElement(By.id("lst-ib")).clear();
		
		
		d.quit();
		

	}

}
