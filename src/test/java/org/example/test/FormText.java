package org.example.test;

import org.example.test.pom.FormPom;
import org.example.test.utilis.Driver1;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormText {

    public WebDriver driver;
    public static String URL = "https://demoqa.com/automation-practice-form";
    public static String FIRST_NAME = "https://demoqa.com/automation-practice-form";

    @BeforeClass
    public void beforeTest () {
        driver = Driver1.getAutoLocalDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void formTest () throws InterruptedException {
        driver.get(URL);

        FormPom form = new FormPom(driver);
        form.setFirstName(FIRST_NAME);

        form.closeAdvert();

        Thread.sleep(2000);

        System.out.println();
    }

    @AfterClass
    public void afterTest () {

    }

}
