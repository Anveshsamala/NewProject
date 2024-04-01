package com.execution;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.pages.FacebookLoginpage;
import com.utilities.Basicclass;

public class Loginflow {
	
	@Test
	public void loginwithinvalidcredentials() throws EncryptedDocumentException, IOException
	{
		Basicclass bc=new Basicclass();
		bc.opentheBrower();
		bc.login();
		FacebookLoginpage lgn=new FacebookLoginpage();
		
	}

}
