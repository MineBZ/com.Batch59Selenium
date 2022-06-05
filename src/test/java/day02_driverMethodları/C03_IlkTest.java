package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {

        /*https:www.amazon.com.url'ine gidin
         2-başlığın amazon kelimesi içerdiğini test edin
         3-url'in https://www.amazon.com a eşit olduğunu test edin
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //1-https:www.amazon.com.url'ine gidin
         driver.get("https://www.amazon.com");
        //2-başlığın amazon kelimesi içerdiğini test edin
         String actualTitle=driver.getTitle();
         String arananKelime="Amazon";
         if (actualTitle.contains(arananKelime)){
             System.out.println("Title testi PASSAD");

         }else{
             System.out.println("Title"+arananKelime+"yi içermiyor, title testi FAİLED");
         }

         //3-url'in https://www.amazon.com a eşit olduğunu test edin
         String actuelUrl=driver.getCurrentUrl();
         String expectedUrl="https://www.amazon.com.tr";
        if (actualTitle.equals(expectedUrl)){
            System.out.println("Url testi PASSED");

        }else{
            System.out.println("actuel url:"+actuelUrl+" beklenen url'den farlı, test FAİLED");
        }


    }

    }

