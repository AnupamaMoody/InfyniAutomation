package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.CoursePageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.PageObjects.FooterPageObjects.clickHome;

@Test
public class ProfessionalTestCase extends CoursePageObjects {

    @Test(groups = "smoke",priority = 9)
    public static void VerfiyProfessionalPage() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        ClickProfessionalLink();
        String actualText = CaptureProfessionalText();
        String expectedText ="Professionals";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Professionals Test Case Passed");


    }
}
