package inClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Dialect;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		System.out.println("success");
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(189, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(189, TimeUnit.SECONDS);
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.jiomart.com/c/groceries/2");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(189, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(189, TimeUnit.SECONDS);
		
		
		

	}

}
