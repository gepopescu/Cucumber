package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDefinition {
    WebDriver webDriver;
    List<WebElement> checkOwner;

    @Given("^I can navigate to petclinic site$")
    public void iCanNavigateToPetclinicSite() throws Throwable {
        webDriver = new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }



    @When("^I complete the required fields as firstName \"([^\"]*)\",lastName \"([^\"]*)\", address \"([^\"]*)\",city \"([^\"]*)\",telephone \"([^\"]*)\"$")
    public void iCompleteTheRequiredFieldsAsFirstNameLastNameAddressCity(String firstname, String lastname, String address, String city,String telephone) throws Throwable {
        webDriver.findElement(By.xpath("//a[text()='Owners']")).click();
        webDriver.findElement(By.xpath("//a[@routerlink='/owners/add']//span[contains(text(),'Add New')]")).click();
        webDriver.findElement(By.id("firstName")).sendKeys(firstname);
        webDriver.findElement(By.id("lastName")).sendKeys(lastname);
        webDriver.findElement(By.id("address")).sendKeys(address);
        webDriver.findElement(By.id("city")).sendKeys(city);
        webDriver.findElement(By.id("telephone")).sendKeys(telephone);

//       webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//       webDriver.findElement(By.xpath("//*[@class='btn btn-default'][2]")).click();

    }


    @Then("^The new owner is displayed$")
    public void theNewOwnerIsDisplayed() throws Throwable {
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        webDriver.findElement(By.xpath("//*[@class='btn btn-default'][2]")).click();
        webDriver.findElement(By.xpath("//h2[contains(text(),'Owners')]")).isDisplayed();
       // webDriver.findElement(By.xpath("//*[@class='btn btn-default'][2]")).click();
        }


    @Given("^I can go to home in petclinic site$")
    public void iCanGoToHomeInPetclinicSite() throws Throwable {
        webDriver = new ChromeDriver();
        webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("^The message error is displayed$")
    public void theMessageErrorIsDisplayed() throws Throwable {
        String expectedText="Phone number only accept digits";
        String actualText = webDriver.findElement(By.xpath("//span[contains(text(),'Phone number only accept digits')]")).getText();
        Assert.assertTrue(expectedText.equals(actualText));
    }
}
