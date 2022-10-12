package testLoginpackages;

import java.io.IOException;

import org.testng.annotations.Test;

import PagePackage.LoginPage;
import generic.BaseTest;
import generic.Flib;

public class TestActiTimeValidLogin extends BaseTest {
	
	@Test
	public void loginActitime() throws InterruptedException, IOException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		lp.actitimeValidLogin(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "password"));
		
	}
	

}
