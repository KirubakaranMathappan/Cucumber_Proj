package baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.PublicKey;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Alert alert;

    public static WebDriver browserlaunch(String browser) {
            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }
            return driver;
        }
        public static void url(String url){
        driver.get(url);
        driver.manage().window().maximize();
        }
        public static void implicitlywait(int t){
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
        }
        public static  void explicitywait(int t){
           wait=new WebDriverWait(driver, Duration.ofSeconds(t));
        }

        public static String getTitle(){
            String title=driver.getTitle();
            return title;
        }
        public static String getCurrenturl(){
            String currentUrl = driver.getCurrentUrl();
            return currentUrl;
        }
        public static void quitbrowser(){
            driver.quit();
        }
        public static void closebrowser(){
            driver.close();
        }
        public static void click(WebElement c){
            c.click();
        }
        public static void sendkeys(WebElement e, String values){
            e.sendKeys(values);
        }
        public static String getText(WebElement e){
            String text = e.getText();
            return text;
        }
        public static String getAttributevalue(WebElement e){
            String attribute = e.getAttribute("values");
            return attribute;
        }

        public static void clear(WebElement text){
                text.clear();
        }

        public static void selectDropdown(WebElement element, SelectType type, String value) {
        Select select = new Select(element);

        switch (type) {
            case INDEX:
                select.selectByIndex(Integer.parseInt(value));
                break;

            case VALUE:
                select.selectByValue(value);
                break;

            case VISIBLETEXT:
                select.selectByVisibleText(value);
                break;
        }
    }
        public  static void mouseaction(WebElement source,WebElement target, MouseActionType actionType){
            Actions a=new Actions(driver);
            switch (actionType) {
                case MOVE_TO_ELEMENT:
                    a.moveToElement(source).perform();
                    break;
                case RIGHT_CLICK:
                    a.contextClick(source).perform();
                    break;
                case DRAG_AND_DROP:
                    a.dragAndDrop(source, target).perform();
                    break;
                case DOUBLE_CLICK:
                    a.doubleClick(source).perform();
                default:
                    throw new IllegalArgumentException("Invalid Mouse Action Type");
            }
        }
    public static void alerthandle(String val, Alerts type ){
        Alert a=driver.switchTo().alert();
        switch (type){
            case Simple_Alert:
                a.accept();
                break;
            case Confirm_Alert:
                a.accept();
                break;
            case Dismiss_Alert:
                a.dismiss();
                break;
            case Prompt_Alert:
                a.sendKeys(val);
                a.accept();
                break;
            default:
                throw new IllegalArgumentException("Invalid alert type");

        }


    }






}


