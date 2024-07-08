package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

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
	    
	}

	@Then("User filter the result with breakfast included, rating, room view")
	public void user_filter_the_result_with_breakfast_included_rating_room_view() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User select Blanket Hotel & spa Munnar")
	public void user_select_blanket_hotel_spa_munnar() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User Swicth to child tab")
	public void user_swicth_to_child_tab() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User click on Book now button")
	public void user_click_on_book_now_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User enter Guest details")
	public void user_enter_guest_details() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User click on pay now button")
	public void user_click_on_pay_now_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User Should redirect to chackout page")
	public void user_should_redirect_to_chackout_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
