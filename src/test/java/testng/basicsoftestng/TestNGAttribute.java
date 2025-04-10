package testng.basicsoftestng;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 100, invocationTimeOut = 1)
    public void attributeExample(){
        System.out.println("TestNG Attribute");
    }
}
