package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class TestAddEditDeleteNewPet extends Testbase{
    public Menu menu;
    public AddNewPet pet;
    public EditPetTypePage editPet;
    public HomePage homePage;

    @Test
    public void AddEditDeleteNewPet(){
        //add new pet
        menu =new Menu(webDriver);
        menu.clickPet();
        pet = new AddNewPet(webDriver);
        pet.clickAddPet();
        pet.addNewPetComplete(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //edit new pet
        pet = new AddNewPet(webDriver);
        pet.getEditButtonNewPet("AnimalXYZ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        editPet = new EditPetTypePage(webDriver);
        editPet.editPetTypePage();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //delete new pet
        pet = new AddNewPet(webDriver);
        pet.getDeleteButtonNewPet("AnimalNou");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //go to homepage and check homepagetitle
        menu.clickHome();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        homePage = new HomePage(webDriver);
        Assert.assertTrue(homePage.getsPageTitle());

    }



}
