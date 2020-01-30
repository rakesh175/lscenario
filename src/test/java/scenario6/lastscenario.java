package scenario6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class lastscenario {
	WebDriver driver;
	@When("open  browser1")
	public void open_browser1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_c2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
	}

	@When("lauches TestMe App1")
	public void lauches_TestMe_App1() {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("Signin with valid user1")
	public void signin_with_valid_user1() {
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@When("search for product in search1 engine")
	public void search_for_product_in_search1_engine() {
		driver.findElement(By.name("products")).sendKeys("Headphone");
	}

	@When("click on find products1")
	public void click_on_find_products1() {
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@Then("validate product is present1")
	public void validate_product_is_present1() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		String s=driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[1]/div/div/h4")).getText();
		Assert.assertEquals(s, "Headphone");
	}


	
}
