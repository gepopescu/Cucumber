package com.endava;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestOwners extends Testbase {

    public HomePage homePage;
    public Owners owner;
    public Menu menu;
    public AddNewOwner adn;
    WebDriverWait wait;

    @Test
    public void AddOwnwer() {

        menu = new Menu(webDriver);
        menu.clickOwners();
        menu.clickAll();
        owner = new Owners(webDriver);
        owner.clickAddOwners();
        adn = new AddNewOwner(webDriver);
        adn.add();
        // webDriver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void deleteSaveCheck() {
        String fn = "Alin";
        String ln = "Ion";

        menu = new Menu(webDriver);
        menu.clickOwners();
        menu.clickAll();
        owner = new Owners(webDriver);
        owner.clickAddOwners();
        adn = new AddNewOwner(webDriver);
        adn.add();
        adn.deleteCharactersTel();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        adn.clickAddOwner();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        owner = new Owners(webDriver); ////?????????????????????????????????????????????


        Assert.assertTrue(owner.getOwnerPresent("Betty Davis"));
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void checkNewOwner(){
        String fn = "Alin";
        String ln = "Ion";
        menu = new Menu(webDriver);
        menu.clickOwners();
        menu.clickAll();
        owner = new Owners(webDriver);
        Assert.assertTrue(owner.getOwnerPresent(fn+" "+ln));


    }


}
