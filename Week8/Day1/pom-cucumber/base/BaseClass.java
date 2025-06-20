package base;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class BaseClass extends AbstractTestNGCucumberTests {
	
public static EdgeDriver driver;
	
	@BeforeMethod
	public void preCondn() {
		
		driver=new EdgeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@AfterMethod
	public void pstCondn() {
		
		driver.close();
		
	}

}
