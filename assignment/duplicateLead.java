package week5.day1.leaftap.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class duplicateLead extends BaseClass {
	@Test
	public void runduplicatelead() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sophia");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("muthiah");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sophia");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("testing");
		driver.findElement(By.xpath("//textarea[@class='inputBox']")).sendKeys("testing using selenium");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sophiaprakash06@gmail.com");
		WebElement element = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dd = new Select(element);
		dd.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leaftap");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("devi");
		driver.findElement(By.name("submitButton")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		
		
	
	}

}
