package InfyniAutomation.PageObjects;

import InfyniAutomation.Base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AboutLinkPageObjects extends Base {

    public static By homeLink = By.xpath("//span[text()=\"Home\"]");
    public static By aboutUsLink=By.xpath("//a[text()=\"About Us\"]");
    public static By aboutUsText=By.xpath("//p[text()=\"About Us\"]");

    public static void clickHome() {

        try {
            driver.findElement(homeLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void clickAboutUs() {

        try {
            driver.findElement(aboutUsLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String captureAboutUsText(){
        String actualText=driver.findElement(aboutUsText).getText();
        return actualText;

    }

}
