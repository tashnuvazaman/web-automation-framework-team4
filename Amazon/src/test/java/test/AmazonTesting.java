package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AmazonTesting {
    public WebDriver driver;

    @Before
    @Test
    public void Home() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tasnu\\IdeaProjects\\web-automation-framework\\Generic\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();








    }

    @After
    public void after () {
        driver.quit();
    }
}


