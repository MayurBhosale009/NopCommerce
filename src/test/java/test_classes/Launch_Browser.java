package test_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import page_classes.Login_Page;
import utility.Read_Property_File;

public class Launch_Browser extends Read_Property_File
{
	Login_Page lp;
	public static WebDriver driver;
	
	@BeforeSuite
	public void init_Browser() throws IOException
	{	
		driver = new ChromeDriver();
		driver.get(readData("url"));
//		driver.get(/*Read_Property_File.*/readData("url"));	
//		return driver;
	}
	
	@BeforeClass
	public void object_Create()
	{
		lp = new Login_Page(driver);
	}
	
}
