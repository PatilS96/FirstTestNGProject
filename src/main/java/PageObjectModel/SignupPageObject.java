package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObject {
	
	public WebDriver driver;
	private By firstname=By.xpath("//input[@name='UserFirstName']");
	private By lastname=By.xpath("//input[@name='UserLastName']");
	private By workemail=By.xpath("//input[@name='UserEmail']");
	private By company=By.xpath("//input[@name='CompanyName']");
	private By phone=By.xpath("//input[@name='UserPhone']");
	private By jobtitle=By.xpath("//select[@name='UserTitle']");
	private By employees=By.xpath("//select[@name='CompanyEmployees']");
    
	public SignupPageObject(WebDriver driver2) {
		this.driver=driver2; 
	}

	public WebElement FirstName() {
		return driver.findElement(firstname);
	}
	
	public WebElement LastName() {
		return driver.findElement(lastname);
	}
	
	public WebElement WorkEmail() {
		return driver.findElement(workemail);
	}
	
	public WebElement Company() {
		return driver.findElement(company);
	}
	
	public WebElement Phone() {
		return driver.findElement(phone);
	}
	
	public WebElement SelectJobTitle() {
		return driver.findElement(jobtitle);
	}
	
	public WebElement SelectEmployees() {
		return driver.findElement(employees);
	}
}
