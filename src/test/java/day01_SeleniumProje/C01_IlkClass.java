package day01_SeleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
        /*En ilkel haliyle bir otomasyon yapmak için
         Class'ımıza gerekli olan webdriver'ın yerini göstermemiz gerekir
         bunun için java kütüphanesinden System.setProperty() methodu kullanılır
         method 2 parametre istemektedir
         ilki kullanacağımız driver:webdriver.chrome.driver
         ikincisi ise bu driver ın fiziki yolu

        */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");
        driver.close();

    }

}
