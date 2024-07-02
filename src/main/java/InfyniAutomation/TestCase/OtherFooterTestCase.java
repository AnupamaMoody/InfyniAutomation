package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.FooterPageObjects;
import org.testng.Assert;
import org.testng.annotations.Test;

import static InfyniAutomation.Base.Base.implicitTime;
import static InfyniAutomation.Base.Base.scrollDown;
import static InfyniAutomation.PageObjects.FooterPageObjects.*;

@Test
public class OtherFooterTestCase extends FooterPageObjects {

    @Test(groups = "smoke",priority = 5)
    public static void OtherFooterTestCase() throws InterruptedException {
        // TODO Auto-generated method stub

        implicitTime(5);
        clickHome();
        scrollDown();
        //USA Address text on the footer
        String actualText = captureUsaAddressText();
        String expectedText ="USA : 26211 Central Park Blvd, Southfield, MI 48076, United States";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("USA Address Test Case passed");

        //India Address text on the footer

        String actualText1 = captureIndiaAddressText();
        String expectedText1 ="India : #701, 7th Floor, Eros City Square, Sector 49, Gurgaon, Haryana -122018";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("India Address Test Case passed");

        //Contact number on the footer

        String actualText2 = captureContactNumber();
        String expectedText2 ="+1 (800) 862-0397 ";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Contact NUmber Test Case passed");

        //email id on the footer

        String actualText3 = captureEmailID();
        String expectedText3 ="contact@infyni.com";

        Assert.assertEquals(actualText, expectedText);
        System.out.println("Email ID Test Case passed");

    }
}
