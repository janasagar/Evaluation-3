package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports.html"},features = "C:\\Users\\kkkkr\\OneDrive\\Desktop\\masai\\unit3\\sdet201\\evaluation3\\cucumber\\src\\test\\resources\\makemytrip\\book_hotel.feature", glue = "step_def")
public class testng extends AbstractTestNGCucumberTests {
	

}
