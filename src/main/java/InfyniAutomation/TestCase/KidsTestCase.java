package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.CoursePageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.PageObjects.FooterPageObjects.clickHome;

@Test
public class KidsTestCase extends CoursePageObjects {

    @Test(groups = "smoke",priority = 10)
    public static void VerfiyKidsPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        ClickKidsLink();
        String actualText = CaptureKidsText();
        String expectedText ="Kids";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Kids Test Case Passed");


    }
}
