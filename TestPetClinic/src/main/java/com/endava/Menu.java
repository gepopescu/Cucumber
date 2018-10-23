package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
    private WebElement home;
    private WebElement ow;
    private WebElement pet;
    private WebElement veter;
    private WebElement special;
    private WebElement all;
    private WebElement  addNewVet;
    private WebElement all_vet;



    public Menu(WebDriver webDriver){

        home = webDriver.findElement(By.xpath("//span[text()='Home']"));
        ow = webDriver.findElement(By.xpath("//a[text()='Owners']"));
        veter = webDriver.findElement(By.xpath("//a[text()='Veterinarians']"));
        pet = webDriver.findElement(By.linkText("PET TYPES"));
        special = webDriver.findElement(By.linkText("SPECIALTIES"));
        all=webDriver.findElement(By.xpath("(//span[contains(text(),'All')])[1]"));
        addNewVet = webDriver.findElement(By.xpath("(//span[text()=' Add New'])[2]"));
        all_vet = webDriver.findElement(By.xpath("(//span[contains(text(),'All')])[2]"));


    }

    public void clickHome(){
        home.click();
    }

    public void clickOwners(){
        ow.click();
    }

    public void clickVegetar(){
        veter.click();
    }
    public void clickPet(){
        pet.click();
    }
    public void clickSpecial(){
        special.click();
    }
    public void clickAll(){
        all.click();
    }
    public void clickButtonAddNewVet(){
        addNewVet.click();
    }
    public void clickButtonAllVet(){
        all_vet.click();
    }



}
