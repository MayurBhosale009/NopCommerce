package page_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page 
{	
	WebDriver driver;
	
	private @FindBy (xpath="//*[text()='Log in']") WebElement login_home;
	
	private @FindBy (xpath="//*[@class='email']") WebElement email;
	
	private @FindBy (xpath="//*[@class='password']") WebElement password;
	
	private @FindBy (xpath="//*[@class='button-1 login-button']") WebElement login_button;
				
	public Login_Page(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void signIn_Method(String user, String pass) throws InterruptedException
	{
		login_home.click();
		email.sendKeys(user);
		Thread.sleep(2000);
		password.sendKeys(pass);
		Thread.sleep(2000);
		login_button.click();
	}
}
