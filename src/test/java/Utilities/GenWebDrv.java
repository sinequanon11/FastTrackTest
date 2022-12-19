package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.simple.SimpleLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GenWebDrv {

    private static ThreadLocal<WebDriver> theradDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowserName.get() == null)
            threadBrowserName.set("chrome");


        if (theradDriver.get() == null) {

            switch (threadBrowserName.get()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    theradDriver.set(new ChromeDriver());
                    break;


                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    theradDriver.set(new FirefoxDriver());
                    break;
            }
        }
        return theradDriver.get();
    }
    public static void quitDriver(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        if (theradDriver.get() != null){
            theradDriver.get().quit();
            WebDriver driver= theradDriver.get(); driver = null;
            theradDriver.set(driver);
        }

    }
    public static void setThreadBrowserName(String browserName) {
        GenWebDrv.threadBrowserName.set(browserName);
    }
    public static String getThreadBrowserName() {
        return GenWebDrv.threadBrowserName.get();
    }
}
