package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditSpecialitiesPage {
    private WebElement editField;
    private WebElement updateButton;

    public EditSpecialitiesPage(WebDriver webDriver){
        editField = webDriver.findElement(By.id("name"));
        updateButton = webDriver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void editSpecialitiesPage(){
        editField.clear();
        editField.sendKeys("dentistry2");
        updateButton.click();
    }
}
