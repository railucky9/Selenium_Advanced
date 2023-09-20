package TestNXXMLTestDataPassing;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmlParam {
     
	@Test
	@Parameters({"UserID", "Password"})
	public void getCredentials(String userID, String password) {
		System.out.println("User ID = " + userID);
		System.out.println("Password = " + password);

}
}