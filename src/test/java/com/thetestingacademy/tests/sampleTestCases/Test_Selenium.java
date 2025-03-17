package com.thetestingacademy.tests.sampleTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Test_Selenium {

    @Test
    public  void  test_VWO(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.vwo.com");
        driver.quit();
    }

}
