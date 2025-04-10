package testng.basicsoftestng;

import org.testng.annotations.*;

public class AnnotationExample {

    @BeforeTest
    public void beforeTestDemo(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTestDemo(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClassDemo(){
        System.out.println("After Class");
    }

    @BeforeMethod
    public void preRequsite(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void postRequsite(){
        System.out.println("After Method");
    }

    @Test
    public void verifyGoogle(){
        System.out.println("Google");
    }

    @Test
    public void verifyRediffmail(){
        System.out.println("Rediffmail");
    }

    @Test
    public void verifyAmazon(){
        System.out.println("Amazon");
    }
}
