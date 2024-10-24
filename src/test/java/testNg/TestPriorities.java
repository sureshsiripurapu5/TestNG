package testNg;

import org.testng.annotations.Test;

public class TestPriorities {

    @Test(priority = 2)
    public void adminLogin(){
        System.out.println("admin logged in successfully");


    }

    @Test(priority = -11)
    public void studentLogin(){
        System.out.println("student logged with valid credentials");
    }

    @Test(priority = -99999)
    public void studentAttendance(){
        System.out.println("Student attendance is 85%");
    }

    @Test(priority = 1)
    public void studentResults(){
        System.out.println("The 1-1 semester cgpa is....");
    }
}
