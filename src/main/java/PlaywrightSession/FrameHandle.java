package PlaywrightSession;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		Playwright playwright = Playwright.create(); {

			Browser browser= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			BrowserContext brcx1=browser.newContext();
			Page page = brcx1.newPage();
			page.navigate("https://www.londonfreelance.org/courses/frames/index.html");
			String header=page.frameLocator("frame[name='main']").locator("h2").textContent();
			System.out.println(header);
			
			BrowserContext brcx2=browser.newContext();
			Page page2=brcx2.newPage();
			page2.navigate("https://www.formsite.com/templates/human-resources/employment-application-form");
			page2.locator("img[title='Employment-Application-Forms-and-Examples']").click();
			Thread.sleep(3000);
			page2.frameLocator("//iframe[contains(@id,'frame-one')]").locator("RESULT_TextField-10").fill("Damini");
			

	}

}
}
