package stepdefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class SampleSD {

    WebDriver driver;

    @Given("I am on login page")
    public void i_am_on_login_page() {
        System.out.println("I am on login page");
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://stock.amolujagare.com/");
    }

    @When("I enter username and password")
    public void i_enter_username_and_password() {
        System.out.println("I enter username and password");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        System.out.println("I click on login button");

        driver.findElement(By.name("submit")).click();
    }
    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
        System.out.println("I should be redirected to the home page");

        String expected = "https://stock.amolujagare.com/dashboard.php";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals(actual,expected,"this is not a dashboard");
    }

    @When("I enter incorrect username and incorrect password")
    public void iEnterIncorrectUsernameAndIncorrectPassword() {

        driver.findElement(By.id("login-username")).sendKeys("fdfd");
        driver.findElement(By.id("login-password")).sendKeys("fdfdf");
    }

    @Then("I should get error")
    public void iShouldGetError() {

        String expected = "https://stock.amolujagare.com/index.php?msg=Wrong%20Username%20or%20Password&type=error";
        String actual = driver.getCurrentUrl();

        Assert.assertEquals(actual,expected,"wrong messsage");
    }
}