package DataProviderDemo;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class dataProviderDemo {
	
	
  @Test(dataProvider = "getData")
  public void getCredentials(String userID, String Password) {
	  
	  System.out.println("User ID "+userID);
	  System.out.println("Password "+Password);
  }

  @DataProvider //This method will supply data
  public Object[][] getData() {
	  
	  Object[][] myCredentials = new Object[3][2];
    
	  myCredentials[0][0] = "username";
	  myCredentials[0][1] = "12345";
	  
	  myCredentials[1][0] = "UserName";
	  myCredentials[1][1] = "11111";
	  
	  myCredentials[2][0] = "USERNAME";
	  myCredentials[2][1] = "22222";
	  
	  return myCredentials;
	  
    };
  }

