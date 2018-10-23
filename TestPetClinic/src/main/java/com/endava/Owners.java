package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class Owners {
    private List<WebElement> checkOwner;
    WebDriverWait wait;
    private WebElement addOwners;




    public Owners (WebDriver webDriver){
        wait = new WebDriverWait(webDriver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ownerFullName")));
        addOwners =webDriver.findElement(By.xpath("//button[contains(text(),\"Add Owner\")]"));
        checkOwner = webDriver.findElements(By.className("ownerFullName"));

    }
    public List<WebElement> getOwnersList(){
        return checkOwner;
    }

    public boolean getOwnerPresent(String OwnerName){
        List<String> textList = new ArrayList<String>();
        for(WebElement we : checkOwner ) {
            textList.add(we.getText());
        }

        for(String l : textList) {
            if (l.equals(OwnerName)) {
                return true;
            }
        }

         return false;
    }

    public boolean getLastOwnerPresent(){
        List<String> textList = new ArrayList<String>();
        for(WebElement we : checkOwner ) {
            textList.add(we.getText());
        }
        String e = textList.get(textList.size() - 1);
        System.out.println(e);
        for(String l : textList) {
            if (l.equals(e)) {
                return true;
            }
        }
        return false;
    }


    public void clickAddOwners(){
        addOwners.click();
    }




}





