package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloBoardHomePage
{
	WebDriver driver;
	public TrelloBoardHomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getCreateBoardOption() {
		return createBoardOption;
	}

	public WebElement getBoardTitle() {
		return BoardTitle;
	}

	public WebElement getBoardCreateSubmitButton() {
		return BoardCreateSubmitButton;
	}

	public WebElement getUserProfileIconMenu() {
		return userProfileIconMenu;
	}

	public WebElement getLogoutOption() {
		return logoutOption;
	}
	
	
	@FindBy(css = "li[data-testid='create-board-tile']")
	private WebElement createBoardOption;
	
	@FindBy(css = "input[data-testid='create-board-title-input']")
	private WebElement BoardTitle;
	
	@FindBy(css = "button[data-testid='create-board-submit-button']")
	private WebElement BoardCreateSubmitButton;
	
	@FindBy(xpath = "//button[@aria-label='Open member menu']")
	private WebElement userProfileIconMenu;
	
	@FindBy(xpath = "//button[@data-testid='account-menu-logout']")
	private WebElement logoutOption;
	
	@FindBy(css = "h2[title='Create board']")
	private WebElement createBoardPopup;
	
	public WebElement getCreateBoardPopup() {
		return createBoardPopup;
	}
}
==========================================================
package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloHomePage 
{
	WebDriver driver;
	public TrelloHomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='Tabsstyles__TabGroup-sc-1grh34k-2 hniXih']/following-sibling::div/a[@href='/login']")
	private WebElement  loginOption;
	
	public WebElement getLoginOption()
	  {
		return loginOption;
	  }
	
	}
==========================================================

	
package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage 
{
	WebDriver driver;
	public TrelloLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user")
	private WebElement EmailTextfield;
	
	public WebElement getEmailTextfield()
	{
		return EmailTextfield;
	}

	@FindBy(id="login")
	private WebElement ContinueSubmitButton;
	
	public WebElement getContinueSubmitButton() {
		return ContinueSubmitButton;
	}
}==========================================================
package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginToContinuePage 
{
	WebDriver driver;
	public TrelloLoginToContinuePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="password")
	private WebElement PasswordTextFiled;
	
	
	public  WebElement getPasswordTextFiled()
	{
		return PasswordTextFiled;
	}


	public  WebElement getPswLoginSubmitButton()
	{
		return PswLoginSubmitButton;
	}

	@FindBy(id="login-submit")
	private WebElement PswLoginSubmitButton;
	
}
==========================================================
package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLogOutPage
{
	
	WebDriver driver;
	public TrelloLogOutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button[id='logout-submit']")
	private WebElement logoutSubmitButton;
	
	public WebElement getLogoutSubmitButton() 
	{
		return logoutSubmitButton;
	}
	}
==========================================================
package com.trello.qsp.pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloWorkPage
{
	WebDriver driver;
	public TrelloWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button[aria-label='Show menu']")
	private WebElement UserMenuIcon;
	
	@FindBy(xpath = "//a[contains(.,'More')]")
	private WebElement moreOption;
	@FindBy(xpath = "//a[contains(.,'Close board')]")
	private WebElement closeBoardOption;
	
	@FindBy(css = "input[value='Close']")
	private WebElement closeButton;
	
	@FindBy(css = "button[data-testid='close-board-delete-board-button']")
	private WebElement permanentyBoard;
	
	@FindBy(css = "button[data-testid='close-board-delete-board-confirm-button']")
	private WebElement deleteBoarsButton;
	
	
	public WebElement getUserMenuIcon() {
		return UserMenuIcon;
	}

	public WebElement getMoreOption() {
		return moreOption;
	}

	public WebElement getCloseBoardOption() {
		return closeBoardOption;
	}

	public WebElement getCloseButton() {
		return closeButton;
	}

	public WebElement getPermanentyBoard() {
		return permanentyBoard;
	}

	public WebElement getDeleteBoarsButton() {
		return deleteBoarsButton;
	}
	
}
==========================================================



	
	

