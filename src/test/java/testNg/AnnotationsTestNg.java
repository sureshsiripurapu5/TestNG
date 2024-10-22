package testNg;

import org.testng.annotations.*;

public class AnnotationsTestNg {

    @Test
    public void simpleTest(){
        System.out.println("simple test");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Executes before all annotations");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("Executes after all annotations");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeAllClasses");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterAllClasses");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeEachClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterEachClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeEachMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterEachMethod");
    }
}
