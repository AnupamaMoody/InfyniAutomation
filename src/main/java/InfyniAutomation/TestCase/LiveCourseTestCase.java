package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.CoursePageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.PageObjects.FooterPageObjects.clickHome;

@Test
public class LiveCourseTestCase extends CoursePageObjects {

    @Test(groups = "smoke",priority = 11)
    public static void VerfiyKidsPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        ClickLiveCoursesLink();
        String actualText = CaptureLiveCoursesText();
        String expectedText ="Live Courses";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Live Courses Test Case Passed");


    }
}
