package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AddNewPet {
    private WebElement addPetButton;
    private List<WebElement> checkPet;
    private List<WebElement> getEdit;
    private List<WebElement> getDelete;
    private WebElement namePet;
    private WebElement savePet;

    public AddNewPet(WebDriver webDriver){
        addPetButton = webDriver.findElement(By.xpath("//button[contains(text(),'Add')]"));
        checkPet = webDriver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        getEdit = webDriver.findElements(By.xpath("//button[contains(text(),'Edit')]"));
        getDelete = webDriver.findElements(By.xpath("//button[contains(text(),'Delete')]"));
    }



    public void clickAddPet(){
        addPetButton.click();
    }
    public void addNewPetComplete(WebDriver webDriver){
        namePet = webDriver.findElement(By.id("name"));
        savePet = webDriver.findElement(By.xpath("//*[contains(@type, 'submit')]"));

        namePet.sendKeys("AnimalXYZ");
        savePet.click();
    }

    public boolean checkPet(String VetName) {
        List<String> textList1 = new ArrayList<String>();
        for (WebElement text : checkPet) {
            textList1.add(text.getText());
        }

        for (String l : textList1) {
            if (l.equals(VetName)) {
                return true;
            }
        }
        return false;
    }

    public void getEditButtonNewPet(String petName) {
       int poz = -1;
        for(int i = 0;i < checkPet.size();i++) {
        if (petName.equals(checkPet.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
            poz=i;
            }
        }
        getEdit.get(poz).click();
    }

    public void getDeleteButtonNewPet(String petName) {
        int poz = -1;
        for(int i = 0;i < checkPet.size();i++) {
            if (petName.equals(checkPet.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
                poz=i;
            }
        }
        getDelete.get(poz).click();
    }
}


