package com.trello.qsp.endtoend;



import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.trello.qsp.genericutility.BaseClass;
import com.trello.qsp.pomrepository.TrelloBoardHomePage;
import com.trello.qsp.pomrepository.TrelloHomePage;
import com.trello.qsp.pomrepository.TrelloLogOutPage;
import com.trello.qsp.pomrepository.TrelloLoginPage;
import com.trello.qsp.pomrepository.TrelloLoginToContinuePage;
import com.trello.qsp.pomrepository.TrelloWorkPage;

public class TrelloBoardComponets extends BaseClass 

{

	@Test
	public void createDeleteListInBoard() throws Throwable 
	{
		webdriverutils.implicitWait(driver);
		TrelloHomePage homepage = new TrelloHomePage(driver);
		homepage.getLoginOption().click();
		TrelloLoginPage loginPage = new TrelloLoginPage(driver);
		loginPage.getEmailTextfield().sendKeys(fileUtils.readCommonData("username"));
		loginPage.getContinueSubmitButton().submit();
		TrelloLoginToContinuePage ContinuePage = new TrelloLoginToContinuePage(driver);
		webdriverutils.explicitWait(driver, ContinuePage.getPasswordTextFiled());
		ContinuePage.getPasswordTextFiled().sendKeys(fileUtils.readCommonData("password"));
		ContinuePage.getPswLoginSubmitButton().submit();
		TrelloBoardHomePage boardHomePage = new TrelloBoardHomePage(driver);
		boardHomePage.getCreateBoardOption().click();
		boardHomePage.getBoardTitle().sendKeys(fileUtils.readCommonData("title"));
		webdriverutils.explicitWait(driver, boardHomePage.getBoardCreateSubmitButton()).click();;
		TrelloWorkPage workpage = new TrelloWorkPage(driver);
		workpage.getUserMenuIcon().click();
		workpage.getMoreOption().click();
		workpage.getCloseBoardOption().click();
		workpage.getCloseButton().click();
		workpage.getPermanentyBoard().click();
		workpage.getDeleteBoarsButton().click();
		boardHomePage.getUserProfileIconMenu().click();
		boardHomePage.getLogoutOption().click();
		TrelloLogOutPage logOutpage = new TrelloLogOutPage(driver);
		logOutpage.getLogoutSubmitButton().click();
		
	}
	}
