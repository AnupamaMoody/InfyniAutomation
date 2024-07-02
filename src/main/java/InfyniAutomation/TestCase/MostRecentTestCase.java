package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.CoursePageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.PageObjects.FooterPageObjects.clickHome;

@Test
public class MostRecentTestCase extends CoursePageObjects {

    @Test(groups = "smoke",priority = 8)
    public static void VerfiyMostRecentPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        ClickMostRecentLink();
        String actualText = CaptureMostRecentText();
        String expectedText ="Most Recent";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Most Recent Test Case Passed");


    }
}
