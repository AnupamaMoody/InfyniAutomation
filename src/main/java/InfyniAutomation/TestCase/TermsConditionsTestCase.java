package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.FooterPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.Base.Base.implicitTime;
import static InfyniAutomation.Base.Base.scrollDown;
import static InfyniAutomation.PageObjects.FooterPageObjects.*;

@Test
public class TermsConditionsTestCase extends FooterPageObjects {

    @Test(groups = "smoke",priority = 4)
    public static void VerfiyTermsCondition() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        clickHome();
        scrollDown();
        clickTermsConditionLink();
        String actualText = captureTermsConditionText();
        String expectedText ="Terms & Conditions";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Terms & Conditions Test case passed");

        driver.navigate().back();
        System.out.println("Back to Main page");

    }
}
