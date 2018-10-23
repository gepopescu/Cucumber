package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewVeterinariansPage {

    private WebElement  fist_name_vet;
    private WebElement last_name_vet;
    private WebElement type;
    private WebElement save_Vet_button;
    private WebElement dentistry;
    private WebElement radiology;
    private WebElement surgery;

    public AddNewVeterinariansPage(WebDriver webDriver){

        fist_name_vet =webDriver.findElement(By.id("firstName"));
        last_name_vet = webDriver.findElement(By.id("lastName"));
        type = webDriver.findElement(By.id("specialties"));
        save_Vet_button=webDriver.findElement(By.xpath("//button[contains(text(),'Save Vet')]"));
        dentistry =webDriver.findElement(By.xpath("//option[@value= \"0: Object\"]"));
        radiology = webDriver.findElement(By.xpath("//option[@value= \"1: Object\"]"));
        surgery =webDriver.findElement(By.xpath("//option[@value= \"2: Object\"]"));
    }


    public void clickButtonSaveVeterians(){
        save_Vet_button.submit();
    }
    public void AddNewVeterians(){
        fist_name_vet.sendKeys("FirstNameVeterinarians");
        last_name_vet.sendKeys("LastNameVeterinarians");



    }
    public void selectTypeSurgery(){
        type.click();
        surgery.click();
    }

    public void selectTypeRadiology(){
        type.click();
        radiology.click();
    }
    public void selectTypeDentistry(){
        type.click();
        dentistry.click();
    }


}
