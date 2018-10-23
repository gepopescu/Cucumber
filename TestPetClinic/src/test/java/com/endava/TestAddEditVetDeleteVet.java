package com.endava;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAddEditVetDeleteVet extends Testbase{
    public Menu menu;
    public VeterinariasPage veterinarians;
    public AddNewVeterinariansPage all_vets;
    public EditVeterinarianPage edit_vet;
    public AddNewVeterinariansPage vet;

    @Test
    public void addVet(){
        menu =new Menu(webDriver);
        menu.clickVegetar();
        menu.clickButtonAddNewVet();

        vet= new AddNewVeterinariansPage(webDriver);
        vet.AddNewVeterians();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        vet.selectTypeDentistry();
        vet.clickButtonSaveVeterians();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void editVetDeleteVet(){

        menu = new Menu(webDriver);
        menu.clickVegetar();
        menu.clickButtonAllVet();

        veterinarians = new VeterinariasPage(webDriver);
        //editez elementul
        int  poz = veterinarians.getAddNewVet("FirstNameVeterinarians LastNameVeterinarians");
        System.out.println(poz);
        veterinarians.getEditButton(poz);
        veterinarians.getEditList();
        edit_vet = new EditVeterinarianPage(webDriver);
        edit_vet.changeLastName();
        edit_vet.changeType(webDriver);
        edit_vet.changeTypeDen();
        edit_vet.clickSave();

        //verific daca elementul e editat
        veterinarians = new VeterinariasPage(webDriver);
        Assert.assertTrue(veterinarians.checkVet("FirstNameVeterinarians TestChange2"));

        //sterg elementul
        veterinarians.getDeleteButton(poz);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //verific daca elementul sters nu se mai gaseste in lista
        veterinarians = new VeterinariasPage(webDriver);
        Assert.assertFalse(veterinarians.checkVet("FirstNameVeterinarians TestChange2"));


    }





}
