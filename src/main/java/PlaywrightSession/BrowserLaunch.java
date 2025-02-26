package PlaywrightSession;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserLaunch {

	public static void main(String[] args) {
		Playwright playwright=Playwright.create();
		LaunchOptions lp= new LaunchOptions();
		lp.setChannel("chrome");
		lp.setHeadless(false);
		Browser browser=playwright.chromium().launch(lp);
		//Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://www.amazon.com");
		
		String title= page.title();
		System.out.println("Title of the page "+title);
		
		String URL= page.url();
		System.out.println("URL of the page "+URL);
		
		browser.close();
		playwright.close();


	}

}
