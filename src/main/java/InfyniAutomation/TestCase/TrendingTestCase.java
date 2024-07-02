package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.CoursePageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.Base.Base.driver;
import static InfyniAutomation.Base.Base.implicitTime;
import static InfyniAutomation.PageObjects.CoursePageObjects.CaptureTrendingText;
import static InfyniAutomation.PageObjects.CoursePageObjects.ClickTrendingLink;
import static InfyniAutomation.PageObjects.FooterPageObjects.clickHome;

@Test
public class TrendingTestCase extends CoursePageObjects {

    @Test(groups = "smoke",priority = 6)
    public static void VerfiyTrendingPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        ClickTrendingLink();
        String actualText = CaptureTrendingText();
        String expectedText ="Trending";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Trending Test Case Passed");


    }
}
