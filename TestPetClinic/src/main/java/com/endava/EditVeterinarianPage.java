package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditVeterinarianPage {
    private WebElement specialities;
    private WebElement first_name;
    private WebElement last_name;
    private WebElement dentistry;
    private WebElement radiology;
    private WebElement surgery;
    private WebElement save;

    public EditVeterinarianPage(WebDriver webDriver){
        specialities =webDriver.findElement(By.xpath("//*[contains(@class, 'mat-input-infix mat-form-field-infix')]"));
        first_name = webDriver.findElement(By.xpath("//input[contains(@id,'firstName')]"));
        last_name = webDriver.findElement(By.xpath("//input[contains(@id,'lastName')]"));

        save = webDriver.findElement(By.xpath("//button[contains(text(),'Save Vet')]"));

    }
    public  void changeType(WebDriver webDriver) {
        specialities.click();
        dentistry = webDriver.findElement(By.xpath("(//*[contains(@class, 'mat-option-text')])[1]"));
        radiology = webDriver.findElement(By.xpath("(//*[contains(@class, 'mat-option-text')])[2]"));
        surgery = webDriver.findElement(By.xpath("(//*[contains(@class, 'mat-option-text')])[3]"));
    }

    public void changeTypeRad() {
        radiology.click();
    }
    public void changeTypeDen() {
        dentistry.click();
    }
    public void changeTypeSur() {
        surgery.click();
    }

    public void changeFirstname(){
        first_name.clear();
        first_name.sendKeys("TestChange1");
    }
    public void changeLastName(){
        last_name.clear();
        last_name.sendKeys("TestChange2");
    }
    public void clickSave(){
        save.submit();
        save.submit();
    }
}
