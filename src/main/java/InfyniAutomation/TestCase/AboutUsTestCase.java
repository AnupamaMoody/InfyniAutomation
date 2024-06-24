package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.AboutLinkPageObjects;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class AboutUsTestCase extends AboutLinkPageObjects {

    @Test(groups = "smoke")
    public static void VerfiyAboutUsPage() {
        // TODO Auto-generated method stub

        implicitTime(5);
        clickHome();
        clickAboutUs();
        String actualText = captureAboutUsText();
        String expectedText ="About Us";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("About Link Test case passed");

        driver.navigate().back();
        System.out.println("Back to Main page");

    }

}

