package week5.day1.leaftap.assignment;

import org.testng.annotations.Test;
import org.openqa.selenium.By;

public class CreateLead extends BaseClass {
	@Test
	public void runCreateLead() {
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sophia");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthiah");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	


	}

}


