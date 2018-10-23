package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewOwner {
    private WebElement first_name;
    private WebElement last_name;
    private WebElement address;
    private WebElement city;
    private WebElement tel;
    private WebElement error;
    private WebElement adOwner;

    public AddNewOwner (WebDriver webDriver){
        first_name = webDriver.findElement(By.id("firstName"));
        last_name = webDriver.findElement(By.id("lastName"));
        address =webDriver.findElement(By.id("address"));
        city = webDriver.findElement(By.id("city"));
        tel =webDriver.findElement(By.id("telephone"));
        adOwner = webDriver.findElement(By.xpath("//*[@class='btn btn-default'][2]"));
    }
    public void add(){
        first_name.sendKeys("Alin");
        last_name.sendKeys("Ion");
        address.sendKeys("TestAd");
        city.sendKeys("City");
        tel.sendKeys("eee");

    }
    public boolean Error(WebDriver webDriver){
        tel.sendKeys("ee");
        error =webDriver.findElement(By.xpath("//span[contains(text(),'Phone number only accept digits')]"));
        return error.isDisplayed();
    }

    public void deleteCharactersTel(){
        tel.clear();
        tel.sendKeys("0734444666");

    }
    public void clickAddOwner(){
        adOwner.submit();
    }

    public boolean addOwnerString(String firstName,String lastName,String address, String city, String telephone){
        boolean ok= true;
        if (this.first_name.getText()==firstName){
            ok = true;
        }else
            ok = false;
        if (this.last_name.getText()==lastName){
            ok = true;
        }else
            ok = false;
        if (this.address.getText()==address){
            ok = true;
        }else
            return false;
        if (this.city.getText()==city){
            ok =true;
        }else
            ok = false;
        if (this.tel.getText()==telephone){
            ok = true;
        }else
             ok = false;

        return ok;
    }

}
