package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignupPageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;

public class VerifySingupTestCase extends BaseClass {
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		
		LoginPageObjects lpo=new LoginPageObjects(driver);
		lpo.TryForFree().click();
		
		Thread.sleep(5000);
		SignupPageObject spo=new SignupPageObject(driver);
		spo.FirstName().sendKeys(TestCaseData.firstname);
		spo.LastName().sendKeys(TestCaseData.lastname);
		spo.WorkEmail().sendKeys(TestCaseData.workemail);
		spo.Company().sendKeys(TestCaseData.company);
		spo.Phone().sendKeys(TestCaseData.phone);
		
		CommonUtilities.DropDownHandle(spo.SelectJobTitle(),1);
		CommonUtilities.DropDownHandle(spo.SelectEmployees(),2);
		
	}

}
