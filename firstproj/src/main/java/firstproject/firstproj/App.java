package firstproject.firstproj;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;

/**
 * Hello world!
 */


public class App {
	static WebDriver driver;
	
	static void openBrowser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Administrator\\Downloads\\Eclipse-Worskspace\\firstproj\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
	}
	
	static void goToUrl(String urlString) {
		driver.get(urlString);
	}
	
	static void clickOnElement(WebElement ele) {
		ele.click();
		
	}
	
	static WebElement findElementByText(String id) {
		WebElement ele = driver.findElement(By.partialLinkText(id));
		return ele;
	}
	
	static WebElement findElementByCSS(String id) {
		WebElement ele = driver.findElement(By.cssSelector(id));
		return ele;
	}
	static void sendKeysToInputBox(WebElement ele, String s) {
		ele.sendKeys(s);
	}
    public static void main(String[] args) {
    	openBrowser();
    	goToUrl("https://demo-saas.bugbug.io/");
    	clickOnElement(findElementByText("Log in"));
    	sendKeysToInputBox(findElementByCSS("input[name=\"email\"]"), "vaishnavias0315@gmail.com");
    	sendKeysToInputBox(findElementByCSS("input[name=\"password\"]"), "aabbcc123");
    	clickOnElement(findElementByCSS("button[type=\"submit\"]"));
    	
        System.out.println("Hello World!");
        
    }
}
