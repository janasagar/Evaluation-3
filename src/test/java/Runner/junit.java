package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports.html"},features = "C:\\Users\\kkkkr\\OneDrive\\Desktop\\masai\\unit3\\sdet201\\evaluation3\\cucumber\\src\\test\\resources\\makemytrip\\book_hotel.feature", glue = "step_def")
public class junit {

}
