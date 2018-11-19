package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DataProviderHolder;

public class DataProviderTest1 {



	@Test(dataProvider = "empLogin", dataProviderClass= DataProviderHolder.class)
	
	public void VerifyInvalidLogin(String userName, String password) {
		
		System.out.println(userName);
		System.out.println(password);
		
		
	
	
}
}//class
