package InfyniAutomation.PageObjects;

import InfyniAutomation.Base.Base;
import org.openqa.selenium.By;

public class LoginPageObjects extends Base {
    public static By emailInputBox = By.xpath("//input[@type=\"email\"]");
    public static By passwordInputBox = By.xpath("//input[@type=\"password\"]");
    public static By SignInButton = By.xpath("//button[@type=\"submit\"]");
    public static By DashboardText=By.xpath("//span[@class=\"font-primary-font-bold tab-panel_title__oPS_k\"][1]");

    public static void enterEmailId(String email) {

        try {
            driver.findElement(emailInputBox).clear();
            driver.findElement(emailInputBox).sendKeys(email);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void enterPassword(String pwd) {

        try {
            driver.findElement(passwordInputBox).sendKeys(pwd);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void clickSignInButton() {

        try {
            driver.findElement(SignInButton).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

        public static String captureDashboardText(){
            String actualText=driver.findElement(DashboardText).getText();
            return actualText;

        }
    }

