package BTJavaOOP3.Common;

public class BaseTest{
    public void createDriver(){
        System.out.println("Browser: "+ " " +Constants.browser+ " "+ "Report: " +" "+ Constants.report+ " " + "Headless: " +Constants.headless);
    }
    public void createDriver(String browser){
        System.out.println("Browser: "+ " " +browser+ " "+ "Report: " +" "+ Constants.report+ " " + "Headless: " +Constants.headless);
    }
    public void closeDriver(){
        System.out.print("Close browser: "+ Constants.browser);
    }
    public void closeDriver(String browser){
        System.out.print("Close browser: " + browser);
    }
}
