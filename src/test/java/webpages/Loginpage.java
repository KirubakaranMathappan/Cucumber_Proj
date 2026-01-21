package webpages;

import baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends BaseClass {
        public Loginpage(){
            PageFactory.initElements(driver,this);
        }

        @FindBy(id="Email")
        private WebElement txtusername;
        @FindBy(id="Password")
        private WebElement txtpassword;
        @FindBy(id="RememberMe")
        private WebElement selectrememberme;
        @FindBy(xpath = "//button[text()='Log in']")
        private WebElement clklogin;
        @FindBy(xpath = "//div[@class='title']")
        private WebElement txtLoginPage;

    public WebElement getTxtLoginPage() {
        return txtLoginPage;
    }

    public WebElement getClklogin() {
        return clklogin;
    }

    public WebElement getSelectrememberme() {
        return selectrememberme;
    }

    public WebElement getTxtpassword() {
        return txtpassword;
    }

    public WebElement getTxtusername() {
        return txtusername;
    }
}
