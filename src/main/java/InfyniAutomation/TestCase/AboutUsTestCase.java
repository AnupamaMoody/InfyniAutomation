package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.FooterPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class AboutUsTestCase extends FooterPageObjects {

    @Test(groups = "smoke",priority = 2)
    public static void VerfiyAboutUsPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        clickHome();
        scrollDown();
        clickAboutUs();
        String actualText = captureAboutUsText();
        String expectedText ="About Us";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("About Link Test case passed");

        driver.navigate().back();
        System.out.println("Back to Main page");

    }

}

