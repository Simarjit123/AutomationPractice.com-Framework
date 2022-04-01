package com.automationPractice.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationPractice.BasePackage.TestBase;
import com.automationPractice.Pages.HomePage;
import com.automationPractice.Pages.MyAccountPage;
import com.automationPractice.Pages.ShoppingCartSummaryPage;
import com.automationPractice.Pages.ShoppingPage;
import com.automationPractice.Pages.SignInPage;

public class ShoppingCartSummaryTest extends TestBase {
	HomePage homepage;

	SignInPage signInpage;
	MyAccountPage myAccountPage;
	ShoppingPage shoppingPage;
	ShoppingCartSummaryPage shoppingCartSummary;

	@BeforeMethod
	public void setUp() {
		intialsation();
		homepage = new HomePage();

		signInpage = homepage.clickSignInBtn();
		myAccountPage = signInpage.clickSignInBtn();
		shoppingPage = myAccountPage.clickWomenbtn();
		shoppingCartSummary = shoppingPage.tshirtShop();
	}

	@Test
	public void cartSummary() {

		shoppingCartSummary = new ShoppingCartSummaryPage();
		shoppingCartSummary.deleteItem();

		/*
		 * String messageActual = shoppingCartSummary.successfulDeleteMessage();
		 * 
		 * Assert.assertEquals(messageActual, prop.getProperty("emptyCartMessage"),
		 * "Message doesn't match");
		 */
	}

}
