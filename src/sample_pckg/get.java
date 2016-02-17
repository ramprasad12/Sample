package sample_pckg;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.navigate().to("http://professional.demo.orangehrmlive.com/");
		
		String exp="orangeHRM";
		String act=d.getTitle();
		
		System.out.println("The actual title is:"+act);
		
		if(exp.equals(act))
			System.out.println("Launch succcccccccc");
		else
			System.out.println("Launch not succcccccccc");
		
		
		//login
				d.findElement(By.id("txtUsername")).sendKeys("Admin");
				d.findElement(By.id("txtPassword")).sendKeys("admihghgh");
				d.findElement(By.id("btnLogin")).click();
				
				String expre="welcome admin";
				String actre=d.findElement(By.id("welcome")).getText();
				
				System.out.println("the actual text is:" +actre);
				
				if(expre.equalsIgnoreCase(actre))
					System.out.println("Login succcccccccc");
				else
					System.out.println("Login not succcccccccc");
				
				
		
		

	}

}
