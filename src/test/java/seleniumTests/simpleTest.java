package seleniumTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simpleTest {
  @Test
  public void launchBrowser() {
	  
	  ChromeOptions option= new ChromeOptions();
	  WebDriverManager.chromedriver().setup();
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  
	  String exptitle = "Google";
	  String acttitle = driver.getTitle();
	  
	  assertEquals(acttitle, exptitle);
	  
  
}
}
