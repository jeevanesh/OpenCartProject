package com.qa.opencart.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {
	
	private WebDriver driver;
	
	// 1. Private by locators:
	private By logoutLink = By.linkText("Logout");
	private By accsHeaders = By.cssSelector("div#content h2");
	private By search = By.name("search");
	

	// 2. page constructor
	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	// 3. public page actions/methods:
	public String getAccPageTitle() {
		String title = driver.getTitle();
		System.out.println("Acc page title: "+title);
		return title;
	}
	
	public String getAccPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Acc page URL: "+url);
		return url;
	}
	
	public boolean isLogoutLinkExist() {
		return driver.findElement(logoutLink).isDisplayed();
	}

	public boolean isSerachExist() {
		return driver.findElement(search).isDisplayed();
	}
	
	public List<String> getAccountsPageHeadersList()
	{
		List<WebElement> accHeadersList = driver.findElements(accsHeaders);
		List<String> accsHeadersValList = new ArrayList<String>();
		
		for(WebElement e : accHeadersList) {
			String text = e.getText();
			accsHeadersValList.add(text);
		}
		return accsHeadersValList;
	}
	
	
	
}
