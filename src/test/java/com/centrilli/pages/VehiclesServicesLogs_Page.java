package com.centrilli.pages;

import com.centrilli.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class VehiclesServicesLogs_Page {

    public VehiclesServicesLogs_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "login")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement loginButton;


    @FindBy(id = "menu_more_container")
    public WebElement moreDropdown;

    @FindBy(xpath = "//a[@href='/web#menu_id=134&action=']")
    public WebElement selectFleet;

    @FindBy(xpath = "//a[@data-menu='148']")
    public WebElement moduleVSL;

    public void login() {
        this.inputUsername.sendKeys("posmanager10@info.com");
        this.inputPassword.sendKeys("posmanager");
        this.loginButton.click();
    }


    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;


    //@FindBy(xpath = "//input[starts-with(@id,'o_field_input_')] and div[contains(@name,'vehicle_id')]")
    //@FindBy(xpath = "//div[@name ='vehicle_id']")
    //@FindBy(xpath = "//input[@id='o_field_input_196']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/table[1]/tbody/tr[2]/td[2]/div/div/input")
    public WebElement vehicleField;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//li[.='Mercedes/Class A/1-MER-001']")
    public WebElement vehicleTittle;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement invalidErrorTittle;

    @FindBy(xpath = "//div[.='Vehicle']")
    public WebElement invalidErrorContent;

    @FindBy(xpath = "//button[@accesskey='j']")
    public WebElement discardButton;

    @FindBy(xpath = "//li[.='Vehicles Services Logs']")
    public WebElement getModuleVSLTittle;

    @FindBy(xpath = "//button[.='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButton;

    //@FindBy(xpath = "//h4[.='Warning']")
    //public WebElement warningTittle;

    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement warningText;

    //@FindBy(xpath = "//li[@class='o_sidebar_add_attachment']")
    @FindBy(xpath = "//button[contains(text(),'Attachment(s)')]")
    public WebElement attachmentButton;

    @FindBy(xpath = "//button[contains(text(),'Action')]")
    public WebElement actionButton;

    //@FindBy(xpath = "//input[@id='o_field_input_197']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[1]/table[1]/tbody/tr[3]/td[2]/div/div/input")
    public WebElement typeField;

    @FindBy(name = "amount")
    public WebElement totalPrice;

    //@FindBy(xpath = "//input[@id='o_field_input_201']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[2]/td[2]/div/input")
    public WebElement date;

    public void dateTimePicker(String date) {
        this.date.sendKeys(date);
        this.date.sendKeys(Keys.TAB);


    }

    // @FindBy(xpath = "//input[@id='o_field_input_202']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[3]/td[2]/div/div/input")
    public WebElement purchaser;

    // @FindBy(xpath = "//input[@id='o_field_input_203']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[4]/td[2]/div/div/input")
    public WebElement vendor;

    @FindBy(xpath = "//input[@name='inv_ref']")
    public WebElement invoiceReference;

    @FindBy(xpath = "//textarea[@name='notes']")
    public WebElement notes;

    //@FindBy(xpath = "//ul[@class='dropdown-menu o_filters_menu']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/button")
    public WebElement filters;

    //@FindBy(xpath = "//span[@title='Advanced Search...']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span")
    public WebElement advancedSearch;

    //@FindBy(xpath = "//a[contains(text(),'Add Custom Filter')]")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[1]/a")
    public WebElement addCustomFilter;
    @FindBy(xpath = "//select[@class='o_input o_searchview_extended_prop_field']")
    public WebElement filterDropdown1;
    //@FindBy(xpath = "//span[@class='o_searchview_extended_prop_value']")
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[2]/span[3]/input")
    public WebElement filterDropdown2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[3]/button[1]")
    public WebElement apply1;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[3]/button[2]")
//    public WebElement addCondition;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[4]/button[2]")
//    public WebElement addCondition2;
//
//
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[5]/button[2]")
//    public WebElement addCondition3;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[6]/button[2]")
//    public WebElement addCondition4;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[7]/button[2]")
//    public WebElement addCondition5;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[8]/button[2]")
//    public WebElement addCondition6;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[9]/button[2]")
//    public WebElement addCondition7;
//
//    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[10]/button[2]")
//    public WebElement addCondition8;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[3]/a")
    public WebElement addCustomFilter2;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[4]/span[2]/select")
    public WebElement filterDropdown3;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[4]/span[3]/input")
    //@FindBy(xpath = "//span[@class='o_searchview_extended_prop_value']")
    public WebElement filterDropdown4;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[5]/button[1]")
    public WebElement apply2;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[5]/a")
    public WebElement addCustomFilter3;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[6]/span[2]/select")
    public WebElement filterDropdown5;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[6]/span[3]/input")
    public WebElement filterDropdown6;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[7]/button[1]")
    public WebElement apply3;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[7]/a")
    public WebElement addCustomFilter4;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[8]/span[2]/select")
    public WebElement filterDropdown7;
    //@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[5]/span[3]/span/div/input")
    @FindBy(xpath = "//input[@class='o_datepicker_input o_input']")
    public WebElement filterDropdown8;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[9]/button[1]")
    public WebElement apply4;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[9]/a")
    public WebElement addCustomFilter5;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[10]/span[2]/select")
    public WebElement filterDropdown9;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[10]/span[3]/input")
    public WebElement filterDropdown10;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[11]/button[1]")
    public WebElement apply5;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[11]/a")
    public WebElement addCustomFilter6;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[12]/span[2]/select")
    public WebElement filterDropdown11;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[12]/span[3]/input")
    public WebElement filterDropdown12;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[13]/button[1]")
    public WebElement apply6;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[13]/a")
    public WebElement addCustomFilter7;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[14]/span[2]/select")
    public WebElement filterDropdown13;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[14]/span[3]/input")
    public WebElement filterDropdown14;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[15]/button[1]")
    public WebElement apply7;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[15]/a")
    public WebElement addCustomFilter8;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[16]/span[2]/select")
    public WebElement filterDropdown15;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[16]/span[3]/input")
    public WebElement filterDropdown16;
    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul/li[17]/button[1]")
    public WebElement apply8;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr[1]/td[3]")
    public WebElement newCreatedVehicle;

    @FindBy(xpath = "//button[@accesskey='l']")
    public WebElement list;

    @FindBy(xpath = "//button[@accesskey='k']")
    public WebElement kanban;

    @FindBy(xpath = "//button[@aria-label='graph']")
    public WebElement graph;

}

