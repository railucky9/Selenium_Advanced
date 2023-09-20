package propDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class propertyDemo {


      @	Test
     public void readCredentials() throws Exception {
    	  String userID, password;
    	  
    	  Properties prop_obj = new Properties();
    	  
    	  FileInputStream fin = new FileInputStream("C:\\Users\\luckr\\OneDrive\\Desktop\\Selenium_Topics\\TestNGXML\\src\\userCredentials.prop");
    	  
    	  prop_obj.load(fin);
    	  
    	  userID = prop_obj.getProperty("userID");
    	  password = prop_obj.getProperty("password");
    	  
    	  System.out.println("User ID = "+ userID);
    	  System.out.println("Password ="+ password);
    	 
     }

	

}
