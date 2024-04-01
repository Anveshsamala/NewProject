package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.Basicclass;

public class FacebookLoginpage {
	
		
	@FindBy(id = "email")
	private WebElement usernamef;
	
	@FindBy(id = "pass")
	private WebElement passwordf;
	
	@FindBy(name =  "login")
	private WebElement loginbtnf;
	
	@FindBy(id = "u_0_0_kD")
	private WebElement createAccountlinkf;
	
	public FacebookLoginpage()
	{
		PageFactory.initElements(Basicclass.driver, this);
	}

	public void enterusernamef(String user)
	{
		usernamef.sendKeys(user);
	}
	
	public void enterpasswordf(String pass)
	{
		passwordf.sendKeys(pass);
	}
	
	public void clickonLoginbtn()
	{
		loginbtnf.click();
	}
	
	public void clickonCreateAccountf()
	{
		createAccountlinkf.click();
	}
}
