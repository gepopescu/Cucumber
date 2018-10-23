package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebElement homepage_title ;
    private WebElement header ;
    private WebElement image;


    public HomePage(WebDriver webDriver){
        homepage_title = webDriver.findElement(By.xpath("//h1[contains(text(),'Welcome to Petclinic')]"));
        header = webDriver.findElement(By.xpath("//h2[contains(text(),'Welcome')]"));
        image = webDriver.findElement(By.className("img-responsive"));
    }

    public boolean getsPageTitle(){
        return homepage_title.isDisplayed();

    }

    public boolean getsheader(){
        return header.isDisplayed();

    }

    public boolean getsImage(){
        return image.isDisplayed();

    }
}
