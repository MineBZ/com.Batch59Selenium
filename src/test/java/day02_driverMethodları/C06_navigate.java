package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        /*Eğer testimiz sırasonda birden fazla sayfa arasında ileri geri
          hareket edeceksek driver.get() yerine driver.navigate.to methodunu kullanırız
          ve sonrasında forward, back veya refresh methodlarını kullanabiliriz
                */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");

        driver.navigate().back();
        Thread.sleep(2000);

       driver.navigate().forward();
       Thread.sleep(2000);

       driver.navigate().refresh();
       Thread.sleep(2000);


    }
}
