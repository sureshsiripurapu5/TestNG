package testNg.inheritingObjects;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Child extends Parent{

     @Test
     public void sampleTest1(){
      parent.parentMethod();
     }




}
