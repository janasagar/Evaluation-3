package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class hotel_booking {
	
	WebDriver driver;
	
	@Given("User visited to mackmytrip website")
	public void user_visited_to_mackmytrip_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	    
	}

	@When("User select hotel")
	public void user_select_hotel() throws InterruptedException {
		driver.findElement(By.xpath("(//span[@class='headerIconWrapper'])[2]")).click();
		Thread.sleep(4000);
	    
	}

	@When("User Enter location, date, rooms, guests, price per night")
	public void user_enter_location_date_rooms_guests_price_per_night() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//label[@for='city']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']")).sendKeys("Munnar");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//b[contains(text(),'Munnar')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"top-banner\"]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//p[@class='font14 greyText']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'₹5000+')]")).click();
		Thread.sleep(3000);
		
	    
	}

	@When("User click on search button")
	public void user_click_on_search_button() throws InterruptedException {
		
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("hsw_search_button")).click();
		
		
	    
	}

	@Then("Hotels should be displayed")
	public void hotels_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement ls = driver.findElement(By.id("hotelListingContainer"));
		WebDriverWait prd = new WebDriverWait(driver, Duration.ofSeconds(10));
	    prd.until(ExpectedConditions.visibilityOf(ls));
	}

	@Then("User list the hotel names")
	public void user_list_the_hotel_names() {
	    // Write code here that turns the phrase above into concrete actions
//		WebElement ele = driver.findElement(By.cssSelector(".appendTop20.appendBottom20.font22.latoBlack.blackText.textCenter"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		for(int i =0;i<200;i++) {
			
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		}
//		List<WebElement> hotels = driver.findElements(By.className("wordBreak appendRight10"));
//		for(WebElement hotle : hotels) {
//			System.out.println(hotle.getText());
//		}
	    
	}

	@Then("User filter the result with breakfast included, rating, room view")
	public void user_filter_the_result_with_breakfast_included_rating_room_view() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Breakfast Included')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Very Good: 3.5+')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Mountain View')]")).click();
		Thread.sleep(4000);
	    
	    
	}

	@Then("User select Blanket Hotel & spa Munnar")
	public void user_select_blanket_hotel_spa_munnar() {
	    driver.findElement(By.xpath("//span[normalize-space() = 'Blanket Hotel & Spa Munnar']")).click();
	    
	}

	@Then("User Swicth to child tab")
	public void user_swicth_to_child_tab() {
		Set<String> s1 = driver.getWindowHandles();
	    Iterator<String> it = s1.iterator();
	    String parrentid = it.next();
//		System.out.println(parrentid);
		
		String childtid = it.next();
//		System.out.println(childtid);
		driver.switchTo().window(childtid);
		
	    
	}

	@Then("User click on Book now button")
	public void user_click_on_book_now_button() throws InterruptedException {
		Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[normalize-space() = 'BOOK THIS NOW']")).click();
	    Thread.sleep(5000);
	    
	}

	@Then("User enter Guest details")
	public void user_enter_guest_details() throws InterruptedException {
	    driver.findElement(By.id("fName")).sendKeys("Sagar");
	    Thread.sleep(2000);
	    driver.findElement(By.id("lName")).sendKeys("Jana");
	    Thread.sleep(2000);
	    driver.findElement(By.id("email")).sendKeys("sagarjana2@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("mNo")).sendKeys("7098510151");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//p[normalize-space() = 'Confirm and save billing details to your profile']")).click();
	    
	    
	}

	@Then("User click on pay now button")
	public void user_click_on_pay_now_button() throws InterruptedException {
	    driver.findElement(By.xpath("//a[normalize-space()='Pay Now']")).click();
	    Thread.sleep(5000);
	    
	}

	@Then("User Should redirect to chackout page, close the browser")
	public void user_should_redirect_to_chackout_page_close_the_browser() {
	    String url = driver.getCurrentUrl();
	    boolean verify = url.contains("checkout");
	    Assert.assertTrue(verify);
	    driver.quit();
	    
	}

}
