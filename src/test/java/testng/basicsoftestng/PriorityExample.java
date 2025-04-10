package testng.basicsoftestng;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.failedtestrun.FailedExecution;

public class PriorityExample {

    @Test(priority = 1, enabled = true)
    public void testCaseZ() {
    }

    @Test(priority = 'a', groups = "smoke")
    public void testCaseH() {
        System.out.println("test case H");
    }

    @Test(priority = 3)
    public void testCaseA() {
        System.out.println("test case A");
    }

    @Test(priority = -3, groups = "smoke")
    public void testCaseX() {
        System.out.println("test case X");
    }

    @Test(priority = -3)
    public void testCaseM() {
        Assert.assertTrue(false);
        System.out.println("test case M");
    }
}
