package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	
	public static void DropDownHandle(WebElement dropdwownXpath,int dropdownvalue) {
		
		Select s=new Select(dropdwownXpath);
		s.selectByIndex(dropdownvalue);
	}
	
	public static void HandleAssertions(String Actual,String Expected) {
		
		
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(Actual, Expected);
		assertion.assertAll();
	}

}
