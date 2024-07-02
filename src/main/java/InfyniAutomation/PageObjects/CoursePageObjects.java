package InfyniAutomation.PageObjects;

import InfyniAutomation.Base.Base;
import org.openqa.selenium.By;

public class CoursePageObjects extends Base {

    public static By trendingLink= By.xpath("//span[text()='Trending']");
    public static By trendingText= By.xpath("//h1[text()='Trending']");
    public static By mostPopularLink=By.xpath("//span[text()='Most Popular']");
    public static By mostPopularText=By.xpath("//h1[text()='Most Popular']");
    public static By mostRecentLink=By.xpath("//span[text()='Most Recent']");
    public static By mostRecentText=By.xpath("//h1[text()='Most Recent']");
    public static By professionalLink=By.xpath("//span[text()='Professionals']");
    public static By professionalText=By.xpath("//h1[text()='Professionals']");
    public static By kidsLink=By.xpath("//span[text()='Kids']");
    public static By kidsText=By.xpath("//h1[text()='Kids']");
    public static By liveCoursesLink= By.xpath("//span[text()='Live Courses']");
    public static By liveCoursesText= By.xpath("//h1[text()='Live Courses']");

 public static void ClickTrendingLink() {
     try {
         driver.findElement(trendingLink).click();
     } catch (Exception e) {
         throw new RuntimeException(e);
     }
 }

     public static String CaptureTrendingText(){
         String actualText=driver.findElement(trendingText).getText();
         return actualText;

     }

    public static void ClickMostPopularLink() {
        try {
            driver.findElement(mostPopularLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String CaptureMostPopularText(){
        String actualText=driver.findElement(mostPopularText).getText();
        return actualText;

    }

    public static void ClickMostRecentLink() {
        try {
            driver.findElement(mostRecentLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String CaptureMostRecentText(){
        String actualText=driver.findElement(mostRecentText).getText();
        return actualText;

    }
    public static void ClickProfessionalLink() {
        try {
            driver.findElement(professionalLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String CaptureProfessionalText(){
        String actualText=driver.findElement(professionalText).getText();
        return actualText;

    }

    public static void ClickKidsLink() {
        try {
            driver.findElement(kidsLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String CaptureKidsText(){
        String actualText=driver.findElement(kidsText).getText();
        return actualText;

    }
    public static void ClickLiveCoursesLink() {
        try {
            driver.findElement(liveCoursesLink).click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String CaptureLiveCoursesText(){
        String actualText=driver.findElement(liveCoursesText).getText();
        return actualText;

    }


 }




