package BTJavaOOP3.TestCases;

import BTJavaOOP3.Common.BaseTest;

public class TestCases extends BaseTest {
    public void loginCRM(){
        System.out.println("Launch the website https://cms.anhtester.com/login");
        System.out.println("Enter a valid email and password");
        System.out.println("Click on the login button");
        System.out.println("Check redirection to admin page");
    }
    public void Login(){
        createDriver();
        loginCRM();
        closeDriver();
    }
    public void AddCatery(){
        createDriver();
        loginCRM();
        System.out.println("Click on Category in Products lists");
        System.out.println("Click on the \"Add New Category\" button");
        System.out.println("Enter a valid information for the new category");
        System.out.println("Click on the \"Save\" button");
        System.out.println("Check the newly added category");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.Login();
        System.out.println("\n");
        testCases.AddCatery();
    }
}
