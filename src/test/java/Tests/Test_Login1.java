package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.LoginPage;

public class Test_Login1 {
	@BeforeTest
	public void setUp()
	{
		BaseClass.initializeBrowser();
	}
	@Test
	public void test_login_with_valid_credentials()
	{
		LoginPage login=new LoginPage(BaseClass.driver);
		login.setEmail("mgr123");
		login.setPassword("mgr!23");
		login.submit();
	}

	@AfterMethod
	public void tearDown()
	{
		BaseClass.close();
	}
}
