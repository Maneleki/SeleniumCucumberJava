package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedInPage extends BrowserDriver {

    public static String productcategory_formalshoes = "//*[text()='Formal Shoes']";

    public static String productcategory_sportshoes = "//*[text()='Sports']";

    public static String productcategory_sneakers = "//*[text()='Sneakers']";

    public static void visibility_productcategory_formalshoes() throws InterruptedException {
        String actualproductcategory_fs = driver.findElement(By.xpath(productcategory_formalshoes)).getText();
        assertEquals(actualproductcategory_fs,"Formal Shoes");

    }

    public static void visibility_productcategory_sportsshoes() throws InterruptedException {
        String actualproductcategory_ss = driver.findElement(By.xpath(productcategory_sportshoes)).getText();
        assertEquals(actualproductcategory_ss,"Sports");
    }

    public static void visibility_productcategory_sneakersshoes() throws InterruptedException {
        String actualproductcategory_s = driver.findElement(By.xpath(productcategory_sneakers)).getText();
        assertEquals(actualproductcategory_s,"Sneakers");
    }

}
