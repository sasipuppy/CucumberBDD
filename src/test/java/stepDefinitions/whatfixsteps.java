package stepDefinitions;



import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class whatfixsteps {
	
    WebDriver driver;
	
	@Given("Browser is launched")
	public void browser_is_launched() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  }

	@When("I open the Whatfix home page")
	public void i_open_the_whatfix_home_page() {
		driver.get("https://whatfix.com/");
	  
	}

	@Then("I verify the Url")
	public void i_verify_the_url() {
	  assertEquals("https://whatfix.com/",driver.getCurrentUrl()); 
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}

}
