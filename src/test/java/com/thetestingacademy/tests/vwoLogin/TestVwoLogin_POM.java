package com.thetestingacademy.tests.vwoLogin;

import com.thetestingacademy.pages.PageObjectModel.LoginPage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TestVwoLogin_POM {

    @Owner("Himanshu")
    @Description("Verify that invalid creds give error message")
    @Test
    public void testLoginNegativeVWO(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");


        LoginPage_POM loginPagepom = new LoginPage_POM(driver);
        String error_msg = loginPagepom.loginToVWOLoginInvalidCreds("admin@gmail.com","123");

        assertThat(error_msg).isNotBlank().isNotNull().isNotEmpty();
        Assert.assertEquals(error_msg,"Your email, password, IP address or location did not match");

        driver.quit();


    }
}
