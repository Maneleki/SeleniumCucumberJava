package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static WebDriver driver;
    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_btn_xpath = "//*[@id=\"second_form\"]/input";

    public static void sendkeys_username() throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys("scott.gale@gmail.com");
    }

    public static void sendkeys_password() throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys("P@sword!");

    }

    public static void click_login_btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
}
