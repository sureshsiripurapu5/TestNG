package testNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EcommerceDependsOnMethods {

    @Test
    public void login(){
        System.out.println("login");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "login")
    public void searchByItems(){
        System.out.println("search");
    }

    @Test(dependsOnMethods = "searchByItems")
    public void selectItem(){
        System.out.println("Item selected");
    }

    @Test(dependsOnMethods = {"login","selectItem"})
    public void paymentGateway(){
        System.out.println("payment success");
    }

    @Test(dependsOnMethods = "paymentGateway")
    public void trackItem(){
        System.out.println("Item tracked");
    }
}
