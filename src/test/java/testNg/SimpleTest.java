package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTest {

    @Test
    public void webAutomation(){
        System.out.println("webAutomation");
        Assert.assertEquals(1,1);
    }

    @Test
    public void objectiveC(){
        System.out.println("objective c");

    }

    @Test
    public void java(){
        System.out.println("Java 5");
        Assert.assertTrue(8>1);

    }
}
