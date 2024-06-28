package InfyniAutomation.TestCase;

import InfyniAutomation.PageObjects.LoginPageObjects;
import org.testng.Assert;
import org.testng.annotations.*;

@Test
public class LoginTestCase extends LoginPageObjects {

        @Test(groups = "smoke",priority = 1)
        @Parameters({"EmailId", "Password"})
        public static void VerfiyUserLogin(String arg1, String arg2) {
            // TODO Auto-generated method stub

            implicitTime(5);
            enterEmailId(arg1);
            enterPassword(arg2);
            clickSignInButton();
            String actualText = captureDashboardText();
            String expectedText ="Dashboard";

            Assert.assertEquals(actualText, expectedText);
            System.out.println("Login Test case passed");
        }
}
