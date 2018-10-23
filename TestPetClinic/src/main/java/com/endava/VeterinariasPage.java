package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class VeterinariasPage {

    private List<WebElement> checkVet;
    private List<WebElement> checkEditVet;
    private List<WebElement> checkDeleteVet;
    WebDriverWait wait;
    private WebElement editVet;
    private WebElement deleteVet;


    public VeterinariasPage(WebDriver webDriver) {
        wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("vets")));
        checkVet = webDriver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        checkEditVet = webDriver.findElements(By.xpath("//button[contains(text(),'Edit')]"));
        checkDeleteVet = webDriver.findElements(By.xpath("//button[contains(text(),'Delete')]"));
    }

    public List<WebElement> getVetList() {
        return checkVet;
    }

    public List<WebElement> getEditList() {
        return checkEditVet;
    }

    public List<WebElement> getDeleteList() {
        return checkDeleteVet;
    }

    public int getAddNewVet(String VetName) {
        List<String> textList = new ArrayList<String>();
        int poz = -1;
        for (WebElement we : checkVet) {
            textList.add(we.getText());

        }
        for (String l : textList) {
            if (l.equals(VetName)) {
                poz = textList.indexOf(VetName);
                //System.out.println(poz);
                //heckEditVet.get(poz).click();
            }
        }
        return poz;

    }
    public void getEditButton(int poz){
        checkEditVet.get(poz).click();
    }
    public void getDeleteButton(int poz){
        checkDeleteVet.get(poz).click();
    }

    public boolean checkVet(String VetName) {
        List<String> textList1 = new ArrayList<String>();
        for (WebElement text : checkVet) {
            textList1.add(text.getText());
        }

        for (String l : textList1) {
            if (l.equals(VetName)) {
                return true;
            }
        }
        return false;
    }


}


