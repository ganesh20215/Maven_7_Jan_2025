package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {

    @Test(description = "Verify Login with valid username and valid password")
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login Page");
    }

    @Test(dependsOnMethods = "verifyLogin")
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyOnboarding(){
        System.out.println("Verify Onboarding..");
    }
}
