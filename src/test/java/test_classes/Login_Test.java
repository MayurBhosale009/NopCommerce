package test_classes;

import java.io.IOException;

import org.testng.annotations.Test;

public class Login_Test extends Launch_Browser
{
	@Test
	public void signIn() throws InterruptedException, IOException
	{		
		lp.signIn_Method(readData("username"), readData("password"));//("dineshzaa@gmail.com", "Test@123")		
	}
}
