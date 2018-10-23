package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPetTypePage {
    private WebElement editField;
    private WebElement updateButton;

    public EditPetTypePage(WebDriver webDriver){
        editField = webDriver.findElement(By.id("name"));
        updateButton = webDriver.findElement(By.xpath("//button[@type='submit']"));
       // updateButton = webDriver.findElement(By.className("btn btn-default"));

    }

    public void editPetTypePage(){
        editField.clear();
        editField.sendKeys("AnimalNou");
        updateButton.click();
    }
}
