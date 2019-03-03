package test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.epam.reportportal.testng.ReportPortalTestNGListener;

import pom.HomePage;
import pom.NineInchCheeseCakePage;
import pom.TriplceChocCheeseCakePage;
import generic.BaseTest;

public class Scenario1 extends BaseTest {
	
	@Test
	public void scenario1() throws InterruptedException {
		
		Logger logger = Logger.getLogger("LogDemo");
		logger.info("Clicking on nine Inch Cheese cake");
		logger.info("Clicking on nine Inch Cheese cake");
		logger.info("Clicking on nine Inch Cheese cake");
		logger.info("Clicking on nine Inch Cheese cake");
		logger.info("Clicking on nine Inch Cheese cake");
		logger.info("Clicking on nine Inch Cheese cake");
		HomePage hp = new HomePage(driver);
		
		try{
			
			hp.clickNineInchCheeseCake();
		
		} catch(WebDriverException e) {
			hp.clickMaskClose();
			Thread.sleep(5000);
			hp.clickNineInchCheeseCake();
		}
		
		NineInchCheeseCakePage ncp = new NineInchCheeseCakePage(driver);
		ncp.clickTripleChocCheeseCake();
		
		TriplceChocCheeseCakePage tp = new TriplceChocCheeseCakePage(driver);
		tp.clickAddToCartBtn();

		logger.error("Failed");
		
	}
}
