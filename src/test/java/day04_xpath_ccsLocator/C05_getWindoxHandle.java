package day04_xpath_ccsLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_getWindoxHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println(driver.getWindowHandle());
        //CDwindow-D4C42E580B17241B465678B132825A3B benzersiz olarak acılan windowa ait hash
        //CDwindow-38573417AD9AD0697622B39270A18854 kodunu verir

    }
}
