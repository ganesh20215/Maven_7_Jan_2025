package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupsExample {

    @Test(groups = {"smoke"})
    public void verifyLogin(){
        Assert.assertTrue(true);
        System.out.println("Verify Login Page");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyHomePage(){
        System.out.println("Verify Home Page");
    }

    @Test
    public void verifyOnboarding(){
        System.out.println("Verify Onboarding..");
    }
}
