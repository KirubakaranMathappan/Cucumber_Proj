package definition;

import baseclass.BaseClass;
import io.cucumber.java.en.*;
import org.junit.Assert;
import webpages.Registerpage;

public class RegistrationStep extends BaseClass {
    Registerpage r;

    @Given("the user has to launch application url")
    public void the_user_has_to_launch_application_url() {
        browserlaunch("Chrome");
        url("https://demo.nopcommerce.com/");
        implicitlywait(10);
    }
    @When("the user navigate to register page")
    public void the_user_navigate_to_register_page() {
        r=new Registerpage();
        click(r.getRegisterbuttonhome());
    }
    @When("verify the register page with proper validation")
    public void verify_the_register_page_with_proper_validation() {
        Assert.assertEquals("nopCommerce demo store. Register",getTitle());
        Assert.assertTrue(r.getYourpersonaldetails().isDisplayed());
    }
    @When("the user has to provide valid details for registration")
    public void the_user_has_to_provide_valid_details_for_registration() {
        click(r.getGendermale());
        sendkeys(r.getFirstname(),"Kirubakaran");
        sendkeys(r.getLastname(),"M");
        sendkeys(r.getEmail(),"m.kirubakaranoct13@gmail.com");
        try {
            sendkeys(r.getPassword(), "123456");
        }
        catch (Exception e){
            System.out.println("Password not matched the rules");
        }
        sendkeys(r.getConfirmpassword(), "123456");
        click(r.getRegisterbutton());
    }
    @Then("verify the registration successful message")
    public void verify_the_registration_successful_message() {
        Assert.assertTrue(r.getRegsiterconfirmation().getText().contains("Your registration completed"));
        quitbrowser();
    }
}
