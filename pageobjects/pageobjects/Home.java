package com.inportia.pageobjects;

public class Home {
	String xpathTabHomeLink = "//li/a[@title='Home']";
	String xpathTabAboutUsLink = "//li/a[@title='About us']";
	String xpathTabSearchFilterLink = "//li/a[@title='Search Filter']";
	String xpathTabElectionMapsLink = "//li/a[@title='Election Maps']";
	String xpathTabsummaryReportLink = "//li/a[@title='Summary Report']";
	String xpathTabBlogLink = "//li/a[@title='Blog']";
	String xpathTabReportErrorsLink = "//li/a[@title='Report Errors']";
	
	String xpathSocialMediaLinkRSSFEED = ".//*[@id='main_menu']/div[1]/div[2]/a[1]/img";
	String xpathSocialMediaLinkFB = "//div[@id='main_menu']/div[1]/div[2]/a[2]/img";
	String xpathSocialMediaLinkTwitter = "//div[@id='main_menu']/div[1]/div[2]/a[3]/img";
	
	String cssPCElectionDDYear = "#year";
	String cssPCElectionDDState = "#state";
	String cssACElectionDDState = "#stateac";
	String cssACElectionDDYear = "#yearac";
	String xpathPCElectionGoButton = ".//div[@id='error']/preceding-sibling::input";
	String xpathACElectionGoButton = ".//select[@id='yearac']/following-sibling::input";
	
	String cssPartyNameTextBox = "#partylist";
	String cssStateNameTextBox = "#statelist";
	
	String xpathPartyNameSearchButton = ".//*[@id='form']/input[2]";
	String xpathStateNameSearchButton = ".//*[@id='stateSummaryfrm']/input[2]";
	
	
	
}
