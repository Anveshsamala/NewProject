package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilities.Basicclass;

public class CreateFBAccountpage {

	@FindBy(name = "firstname")
	private WebElement firstnamef;

	@FindBy(name = "lastname")
	private WebElement surnamef;

	@FindBy(name =  "reg_email__")
	private WebElement mobileoremailnumber;

	@FindBy(id = "day")
	private WebElement datef;

	@FindBy(id = "month")
	private WebElement monthf;

	@FindBy(id = "year")
	private WebElement yearf;

	@FindBy(className = "_8esa")
	private WebElement genderf;

	@FindBy(name = "websubmit")
	private WebElement Signupbtnf;

	public CreateFBAccountpage()
	{
		PageFactory.initElements(Basicclass.driver, this);

	}

	public void enterfirstname(String fname)
	{
		firstnamef.sendKeys(fname);
	}

	public void entersurname(String sname)
	{
		surnamef.sendKeys(sname);
	}

	public void enteremailidorphonenumber(String emailorpne)
	{
		mobileoremailnumber.sendKeys(emailorpne);
	}

	public void selectDate(String date)
	{
		Select s1=new Select(datef);
		s1.selectByValue(date);
	}

	public void selectMonth(String month)
	{
		Select s2=new Select(monthf);
		s2.selectByValue(month);
	}

	public void selectYear(String year)
	{
		Select s3=new Select(yearf);
		s3.selectByValue(year);
	}

	public void selectGender()
	{
		genderf.click();
	}

	public void clickOnSignUp()
	{
		Signupbtnf.click();
	}

}
