package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.CoursePageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.Base.Base.implicitTime;
import static InfyniAutomation.PageObjects.CoursePageObjects.CaptureTrendingText;
import static InfyniAutomation.PageObjects.CoursePageObjects.ClickTrendingLink;
import static InfyniAutomation.PageObjects.FooterPageObjects.clickHome;

@Test
public class MostPopularTestCase extends CoursePageObjects {

    @Test(groups = "smoke",priority = 7)
    public static void VerfiyMostPopularPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        ClickMostPopularLink();
        String actualText = CaptureMostPopularText();
        String expectedText ="Most Popular";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Most Popular Test Case Passed");


    }
}
