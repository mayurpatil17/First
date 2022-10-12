package generic;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import PagePackage.LoginPage;

public class TestActiTimeInvalidLogin extends BaseTest {

	@Test
	public void actiTimeInvalidLogin() throws EncryptedDocumentException, IOException
	{
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.rowcount(EXCEL_PATH, "invalidcredentials");

		for(int i=1;i<rc;i++)
		{
			String un = flib.readExcelData(EXCEL_PATH, "invalidcredentials", i, 0);
			String pwd = flib.readExcelData(EXCEL_PATH, "invalidcredentials", i, 1);
			

		}
	}

}
