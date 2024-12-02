@Test is used to tell that the method under it is a test case.

@Test(priority='0') the testcase with the lower priority will be executed first.

@Test(groups={'regression','regression'})
groups in testing is a grouping of testmethods  so that we can execute them based on their assigned
group name,rather than running all testcases, we can include or rexculde the groups in testing.xml file.

Parallel Testing in TestNG allows test cases, methods, or classes to run simultaneously rather than sequentially. This is particularly useful for speeding up test execution 

In TestNG, the dependsOnMethods attribute allows a test method to execute only if the specified method(s) it depends on have been executed successfully.

A Data Provider in TestNG is a method that supplies data to test methods. It allows you to execute the same test multiple times with different sets of input data, 

@BeforeSuite annotation is used to define a method that will execute once before all the test cases in the suite.

@BeforeTest annotation in TestNG is used to define a method that will execute once before any test methods in a <test> tag from the TestNG XML file.

 @BeforeClass annotation in TestNG is used to define a method that will execute once before any test methods in the current class are run.

@BeforeMethod annotation in TestNG is used to define a method that will execute before every test method in the current class. 

@AfterMethod annotation in TestNG is used to define a method that will execute after every test method in the current class. 

@AfterClass annotation in TestNG is used to define a method that will execute once after all the test methods in the current class have run.

@AfterTest annotation in TestNG is used to define a method that will execute once after all the test methods in the <test> tag from the TestNG XML file have been run.



