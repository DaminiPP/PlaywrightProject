package PlaywrightSession;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorsConcepts {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create(); {

			Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
			BrowserContext browsercontext=browser.newContext();
			Page page=  browsercontext.newPage();
			page.navigate("https://orangehrm.com");
//			p1.getByPlaceholder("Username").fill("Admin");
//			p1.getByPlaceholder("Username").fill("Admin");
			//Locator contactSales=page.getByText("text=Book a Free Demo").click()
			page.locator("text=Book a Free Demo").last().click();
			page.locator("text=Contact Sales").last().click();
			//page.getByText("text=Book a Free Demo").click();
//			contactSales.hover();
//			contactSales.click();
	}

}
}
