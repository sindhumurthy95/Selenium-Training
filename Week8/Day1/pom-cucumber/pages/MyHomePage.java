package pages;

import org.openqa.selenium.By;

import base.BaseClass;
import io.cucumber.java.en.And;

public class MyHomePage extends BaseClass{
	
	
	@And("click on leads link")
	public MyLeads clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads();
	}

}
