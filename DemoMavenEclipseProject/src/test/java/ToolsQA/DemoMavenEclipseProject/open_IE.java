package ToolsQA.DemoMavenEclipseProject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class open_IE {
	 public static WebDriver driver;
	

	 @BeforeMethod
	   public void beforeMethod() {
		 System.setProperty("webdriver.ie.driver", "/home/ermao/et510-workspace-maven/DemoMavenEclipseProject/browsersExeFilesFOlder/IEDriverServer");

		  // Initialize InternetExplorerDriver Instance.
		  WebDriver driver = new InternetExplorerDriver();
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   }  
	 
	
		  // Create a new instance of the Firefox driver
	@Test
    public static void navigateToGoogle_chrome() {
		driver.get("file:///home/ermao/et510-workspace-maven/DemoMavenEclipseProject/browsersExeFilesFOlder/aravind_01.html");
		//driver.get("https://www.google.com/?gws_rd=ssl");
 }
	
	  @AfterMethod
	   public void afterMethod() {
	      //driver.quit();
	   }
}