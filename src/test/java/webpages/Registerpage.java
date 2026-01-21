package webpages;

import baseclass.BaseClass;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage extends BaseClass {

    public Registerpage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[text()='Register']")
    private WebElement registerbuttonhome;
    @FindBy(xpath = "//h2[text()='Your Personal Details']")
    private WebElement yourpersonaldetails;
    @FindBy(id = "gender-male")
    private WebElement gendermale;
    @FindBy(id="gender-female")
    private WebElement genderfemale;
    @FindBy(id="FirstName")
    private WebElement firstname;
    @FindBy(id="LastName")
    private WebElement lastname;
    @FindBy(name ="Email")
    private WebElement email;
    @FindBy(name = "Company")
    private WebElement companyname;
    @FindBy(xpath = "//input[@class='form-check-input']")
    private WebElement newsletter;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(id = "ConfirmPassword")
    private WebElement confirmpassword;
    @FindBy(xpath = "//button[@id='register-button']")
    private WebElement registerbutton;
    @FindBy(xpath = "//div[@class='result']")
    private WebElement regsiterconfirmation;

    public WebElement getRegsiterconfirmation() {
        return regsiterconfirmation;
    }

    public WebElement getGendermale() {
        return gendermale;
    }

    public WebElement getRegisterbuttonhome() {
        return registerbuttonhome;
    }

    public WebElement getYourpersonaldetails() {
        return yourpersonaldetails;
    }

    public WebElement getGenderfemale() {
        return genderfemale;
    }

    public WebElement getFirstname() {
        return firstname;
    }

    public WebElement getLastname() {
        return lastname;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getCompanyname() {
        return companyname;
    }

    public WebElement getNewsletter() {
        return newsletter;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmpassword() {
        return confirmpassword;
    }

    public WebElement getRegisterbutton() {
        return registerbutton;
    }


}
