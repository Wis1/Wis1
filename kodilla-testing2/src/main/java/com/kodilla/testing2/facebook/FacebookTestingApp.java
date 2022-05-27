package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_ACCEPT_COOKIES = "//div[contains(@class, \"_9xo5\")]/button[1]";
    public static final String XPATH_SELECT_CREATE_ACCOUNT = "//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_BIRTHDAY_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_SELECT_MONTH_BORN = "//select[contains(@name, \"birthday_month\")]";
    public static final String XPATH_SELECT_YEAR_BORN = "//select[contains(@name, \"birthday_year\")]";


    public static void main(String[]args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_SELECT_ACCEPT_COOKIES)).click();
        driver.findElement(By.xpath(XPATH_SELECT_CREATE_ACCOUNT)).click();


        TimeUnit.SECONDS.sleep(2);
        WebElement birthdayDay = driver.findElement(By.xpath(XPATH_BIRTHDAY_DAY));
        Select selectDay = new Select(birthdayDay);
        selectDay.selectByIndex(2);


        WebElement birthdayMonth=driver.findElement(By.xpath(XPATH_SELECT_MONTH_BORN));
        Select selectMonth= new Select(birthdayMonth);
        selectMonth.selectByIndex(11);

        WebElement birthdayYear=driver.findElement(By.xpath(XPATH_SELECT_YEAR_BORN));
        Select selectYear= new Select(birthdayYear);
        selectYear.selectByValue("1995");
    }
}
