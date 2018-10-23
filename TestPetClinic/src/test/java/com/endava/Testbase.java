package com.endava;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Testbase {

     WebDriver webDriver; //vizibil de oriunde din pachet

        @Before
        public void init(){
            webDriver = new ChromeDriver();
            webDriver.get("http://bhdtest.endava.com/petclinic/welcome");
            webDriver.manage().window().maximize();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //asteapta maxim 10 sec pentru a aparea elementele
        }

        @After
        public void tearDown(){

            webDriver.quit();
        }

    }




