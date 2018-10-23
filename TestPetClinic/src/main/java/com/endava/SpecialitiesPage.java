package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SpecialitiesPage {
    private WebElement addButton;
    private List<WebElement> checkSpecialities;
    private List<WebElement> getEdit;
    private List<WebElement> getDelete;
    private WebElement nameSpec;
    private WebElement savePet;

    public SpecialitiesPage(WebDriver webDriver){
        addButton = webDriver.findElement(By.xpath("//button[contains(., 'Add')]"));
        checkSpecialities = webDriver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        getEdit = webDriver.findElements(By.xpath("//button[contains(text(),'Edit')]"));
   //   getEdit = webDriver.findElements(By.xpath("//table/tbody/tr/td[3]/button[1]"));
        getDelete = webDriver.findElements(By.xpath("//button[contains(text(),'Delete')]"));
       // getDelete = webDriver.findElements(By.xpath("//table/tbody/tr/td[3]/button[2]"));
    }

    public void clickAddSpec(){
        addButton.click();
    }
    public void addNewSpecComplete(WebDriver webDriver){
        nameSpec = webDriver.findElement(By.id("name"));
        savePet = webDriver.findElement(By.xpath("//*[contains(@type, 'submit')]"));

        nameSpec.sendKeys("dentistry1");
        savePet.click();
    }

    public boolean checkSpecialities(String VetName) {
        List<String> textList1 = new ArrayList<String>();
        for (WebElement text : checkSpecialities) {
            textList1.add(text.getText());
        }

        for (String l : textList1) {
            if (l.equals(VetName)) {
                return true;
            }
        }
        return false;
    }

    public void getEditNewSpec(String specName) {
        int poz = -1;
        for(int i = 0;i < checkSpecialities.size();i++) {
            if (specName.equals(checkSpecialities.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
                poz=i;
            }
        }
        getEdit.get(poz).click();
    }

    public void getDeleteNewSpec(String specName) {
        int poz = -1;
        for(int i = 0;i < checkSpecialities.size();i++) {
            if (specName.equals(checkSpecialities.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
                poz=i;
            }
        }
        getDelete.get(poz).click();
    }

}
