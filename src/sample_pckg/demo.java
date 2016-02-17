package sample_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver d=new FirefoxDriver();
		d.get("http://professional.demo.orangehrmlive.com");
		d.manage().window().maximize();
		
		
		
		
		
		d.findElement(By.id("txtUsername")).sendKeys("Admin");
		d.findElement(By.id("txtPassword")).sendKeys("admin");
		d.findElement(By.id("btnLogin")).click();
		
		d.findElement(By.id("welcome")).click();
		d.findElement(By.linkText("Logout")).click();

	}

}
