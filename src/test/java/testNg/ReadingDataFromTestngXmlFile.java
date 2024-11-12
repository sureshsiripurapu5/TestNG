package testNg;

import org.testng.annotations.*;

public class ReadingDataFromTestngXmlFile {

    @Parameters("browser")
    @BeforeSuite
    public void initializeBrowser(@Optional("edge") String browserType){
        System.out.println("BrowserType ::" +browserType);
    }

    @Parameters("appUrl")
    @BeforeTest
    public void launchApplication(@Optional("https://lms.kluniversity.in/login/index.php") String url){
        System.out.println("applicationUrl:"+url);

    }

    @Parameters({"userName","password"})
    @Test
    public void login(@Optional("2301050155") String name,@Optional("blah") String password){
        System.out.println("userName:"+name);
        System.out.println(("password:"+password));

    }


}
