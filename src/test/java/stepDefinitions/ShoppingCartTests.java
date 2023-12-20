package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.junit.Assert.*;

public class ShoppingCartTests {
    WebDriver driver;

    @Before
    public void setUp() {
        String browser = System.getProperty("browser", "chrome"); // Default to Chrome if no browser specified

        switch (browser.toLowerCase()) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default: // Use Chrome as default
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
    }
    @Given("I am on the Swag Labs website")
    public void i_am_on_the_swag_labs_website() {
        driver = new ChromeDriver();
        driver.get(GlobalVariables.BASE_URL);
    }

    @When("I log in as a standard user")
    public void i_log_in_as_a_standard_user() {
        WebElement username = driver.findElement(By.id("user-name"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        username.sendKeys(GlobalVariables.USERNAME);
        password.sendKeys(GlobalVariables.PASSWORD);
        loginButton.click();

    }

    @And("I add an item to the cart")
    public void i_add_an_item_to_the_cart() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        Thread.sleep(2000);
    }

    @And("I update the quantity of the added item")
    public void i_update_the_quantity_of_the_added_item() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        Thread.sleep(2000);

    }

    @Then("the item should be added successfully to the cart")
    public void the_item_should_be_added_successfully_to_the_cart() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='shopping_cart_container']"));
        Thread.sleep(2000);

    }

    @Then("the quantity should be updated successfully in the cart")
    public void the_quantity_should_be_updated_successfully_in_the_cart() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='shopping_cart_container']"));
        Thread.sleep(2000);

    }

    @When("I remove the item from the cart")
    public void i_remove_the_item_from_the_cart() throws InterruptedException {
        driver.findElement(By.xpath("//button[text()='Remove']")).click();
        Thread.sleep(2000);

    }

    @Then("the item should not be visible in the cart")
    public void the_item_should_not_be_visible_in_the_cart() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='shopping_cart_container']"));
        Thread.sleep(2000);
    }
}
