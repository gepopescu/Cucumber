package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestHome extends Testbase{
        public HomePage homePage;
        public Owners owner;
        public Menu menu;
        public AddNewOwner adn;


        @Test
        public void checkHomePage() {
            homePage = new HomePage(webDriver);
            Assert.assertTrue(homePage.getsPageTitle());
            Assert.assertTrue(homePage.getsheader());
            Assert.assertTrue(homePage.getsImage() );

        }

        @Test
        public void checkOwnerPresent() {
            menu =new Menu(webDriver);

            menu.clickOwners();
            menu.clickAll();

            owner = new Owners(webDriver);
            Assert.assertTrue(owner.getOwnerPresent("Betty Davis"));
        }


        @Test
    public void Error(){
            menu =new Menu(webDriver);
            menu.clickOwners();
            menu.clickAll();
            owner = new Owners(webDriver);
            owner.clickAddOwners();
            adn = new AddNewOwner(webDriver);
            Assert.assertTrue(adn.Error(webDriver));

        }




    }





