package sample_pckg;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstCls {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver praveena=new FirefoxDriver();
		praveena.get("http://google.com");
		praveena.manage().window().maximize();
		
		
		praveena.findElement(By.id("lst-ib")).sendKeys("selenium");
		praveena.findElement(By.name("btnG")).click();

	}

}
