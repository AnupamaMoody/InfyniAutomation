package InfyniAutomation.PageObjects;

import InfyniAutomation.Base.Base;
import org.openqa.selenium.By;

public class FooterPageObjects extends Base {

    public static By homeLink = By.xpath("//span[text()=\"Home\"]");
    public static By aboutUsLink=By.xpath("//a[text()=\"About Us\"]");
    public static By aboutUsText=By.xpath("//p[text()=\"About Us\"]");
    public static By newsLink = By.linkText("News");
    public static By newsText= By.linkText("News");
    public static By termsConditionLink=By.linkText("Terms & Conditions");
    public static By termsConditionText=By.linkText("Terms & Conditions");

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

    public static void clickNewsLink() {

        try {
            driver.findElement(newsLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String captureNewsText(){
        String actualText=driver.findElement(newsText).getText();
        return actualText;

    }

    public static void clickTermsConditionLink() {

        try {
            driver.findElement(termsConditionLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String captureTermsConditionText(){
        String actualText=driver.findElement(termsConditionText).getText();
        return actualText;

    }

}
