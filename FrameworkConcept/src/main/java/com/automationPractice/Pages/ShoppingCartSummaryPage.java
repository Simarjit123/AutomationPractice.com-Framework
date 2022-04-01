package com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.automationPractice.BasePackage.TestBase;

public class ShoppingCartSummaryPage extends TestBase {

	public ShoppingCartSummaryPage() {
		PageFactory.initElements(wd, this);
	}

	@FindBy(css = "a[title='Delete']")
	WebElement deleteBtn;

	/*
	 * public void totalPriceAssert() { Assert.assertEquals(totalPrice.getText(),
	 * "$35.02"); }
	 */
	@FindBy(css = "p[class='alert alert-warning']")
	WebElement deletedMessageText;

	public ShoppingCartSummaryPage deleteItem() {
		deleteBtn.click();

		return new ShoppingCartSummaryPage();
	}

	public String successfulDeleteMessage() {
		return deletedMessageText.getText();

	}
}
