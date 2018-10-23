package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class TestAddEditdeleteSpecialities extends Testbase {
    public Menu menu;
    public SpecialitiesPage spec;
    public EditSpecialitiesPage editSpec;



    @Test
    public void AddEditdeleteSpecialities(){
        // add new specialities
        menu =new Menu(webDriver);
        menu.clickSpecial();
        spec = new SpecialitiesPage(webDriver);
        spec.clickAddSpec();
        spec.addNewSpecComplete(webDriver);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //edit
        spec = new SpecialitiesPage(webDriver);
        spec.getEditNewSpec("dentistry1");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editSpec = new EditSpecialitiesPage(webDriver);
        editSpec.editSpecialitiesPage();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //delete
        spec = new SpecialitiesPage(webDriver);
        spec.getDeleteNewSpec("dentistry2");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        spec = new SpecialitiesPage(webDriver);
        Assert.assertFalse(spec.checkSpecialities("dentistry2"));

    }
}
