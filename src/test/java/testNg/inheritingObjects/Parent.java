package testNg.inheritingObjects;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Parent {

    Parent parent;

    @BeforeSuite
    public void initializeObject(){
        parent = new Parent();
    }


    public void parentMethod(){
        System.out.println("parent object");
    }
}
