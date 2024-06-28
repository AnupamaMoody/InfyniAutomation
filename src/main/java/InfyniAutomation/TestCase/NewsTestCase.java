package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.FooterPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NewsTestCase extends FooterPageObjects {

    @Test(groups = "smoke",priority = 3)
    public static void VerfiyNewsPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        clickHome();
        scrollDown();
        clickNewsLink();
        String actualText = captureNewsText();
        String expectedText ="News";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("News Test case passed");

        driver.navigate().back();
        System.out.println("Back to Main page");

    }

}
