package definition;

import baseclass.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import webpages.Loginpage;

public class LoginStep extends BaseClass {
    Loginpage l;

    @Given("user has to launch browser")
    public void user_has_to_launch_browser() {
         browserlaunch("Chrome");
    }
    @Given("load application url page")
    public void load_application_url_page() {
        url("https://admin-demo.nopcommerce.com/login?returnUrl=%2Fadmin%2F");
    }
    @Given("verify application login page")
    public void verify_application_login_page() {
        Assert.assertEquals(getTitle(),"nopCommerce demo store. Login");
         l=new Loginpage();
        Assert.assertTrue(l.getTxtLoginPage().getText().contains("Welcome"));
    }
    @When("the user has to give {string} and {string}")
    public void the_user_has_to_give_and(String email, String pass) {
        clear(l.getTxtusername());
        sendkeys(l.getTxtusername(),email);
        clear(l.getTxtpassword());
        sendkeys(l.getTxtpassword(),pass);
    }
    @Then("submit the login button")
    public void submit_the_login_button()  {
        click(l.getClklogin());
    }
    @Then("verify login confirmation")
    public void verify_login_confirmation() {
       Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed());
        closebrowser();
    }

}
