package PlaywrightSession;

import java.nio.file.Paths;
import java.util.regex.Pattern;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.options.AriaRole;

public class ToolsQAE2E {

	public static void main(String[] args) {
		 try (Playwright playwright = Playwright.create()) {
		      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
		        .setHeadless(false));
		      BrowserContext context = browser.newContext();
		      context.tracing().start(new Tracing.StartOptions()
		    		  .setScreenshots(true)
		    		  .setSnapshots(true)
		    		  .setSources(true));
		      
		      Page page = context.newPage();
		      page.navigate("https://demoqa.com/");
		      page.getByText("Forms").click();
		      page.getByText("Practice Form").click();
		      page.getByPlaceholder("First Name").click();
		      page.getByPlaceholder("First Name").fill("Damini");
		      page.getByPlaceholder("First Name").click();
		      page.getByPlaceholder("First Name").fill("Damini");
		      page.getByPlaceholder("Last Name").click();
		      page.getByPlaceholder("Last Name").fill("Patil");
		      page.getByPlaceholder("name@example.com").click();
		      page.getByPlaceholder("name@example.com").fill("Damini@g,ail.com");
		      page.getByText("Female").click();
		      page.getByPlaceholder("Mobile Number").click();
		      page.getByPlaceholder("Mobile Number").fill("9869121590");
		      page.locator("#dateOfBirthInput").click();
		      page.getByRole(AriaRole.COMBOBOX).nth(1).selectOption("2020");
		      page.getByLabel("Choose Wednesday, January 1st,").click();
		      page.getByText("Reading").click();
		      page.getByPlaceholder("Current Address").click();
		      page.getByPlaceholder("Current Address").fill("Mumbai");
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Select State$"))).nth(3).click();
		      page.getByText("Haryana", new Page.GetByTextOptions().setExact(true)).click();
		      page.locator("div").filter(new Locator.FilterOptions().setHasText(Pattern.compile("^Select City$"))).nth(3).click();
		      page.getByText("Karnal", new Page.GetByTextOptions().setExact(true)).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		      page.getByText("Forms", new Page.GetByTextOptions().setExact(true)).click();
		      page.getByText("Elements").click();
		      page.getByText("Text Box").click();
		      page.getByPlaceholder("Full Name").click();
		      page.getByPlaceholder("Full Name").fill("Damini");
		      page.getByPlaceholder("Full Name").press("Tab");
		      page.getByPlaceholder("name@example.com").fill("Damini@gmail.com");
		      page.getByPlaceholder("name@example.com").press("Tab");
		      page.getByPlaceholder("Current Address").fill("Mumbai");
		      page.getByPlaceholder("Current Address").press("Tab");
		      page.locator("#permanentAddress").fill("Mumbai");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		      page.getByText("Web Tables").click();
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Add")).click();
		      page.getByPlaceholder("First Name").click();
		      page.getByPlaceholder("First Name").fill("Damini");
		      page.getByPlaceholder("First Name").press("Tab");
		      page.getByPlaceholder("Last Name").fill("Patil");
		      page.getByPlaceholder("Last Name").press("Tab");
		      page.getByPlaceholder("name@example.com").fill("Damini@gmail.com");
		      page.getByPlaceholder("name@example.com").press("Tab");
		      page.getByPlaceholder("Age").fill("29");
		      page.getByPlaceholder("Salary").click();
		      page.getByPlaceholder("Salary").fill("40000000");
		      page.getByPlaceholder("Salary").press("Tab");
		      page.getByPlaceholder("Department").fill("CSE");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		      page.locator("#edit-record-4").getByRole(AriaRole.IMG).click();
		      page.getByPlaceholder("Age").click();
		      page.getByPlaceholder("Age").fill("30");
		      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Submit")).click();
		      
		  	context.tracing().stop(new Tracing.StopOptions()
					  .setPath(Paths.get("trace.zip")));
		  	
		      browser.close();
				playwright.close();
				
			
		    }
		 

	}

}
