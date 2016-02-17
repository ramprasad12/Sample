package sample_pckg;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class chrome_chk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
		
		InternetExplorerDriver driver=new InternetExplorerDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");

	}

}
