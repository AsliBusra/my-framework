package com.centrilli.step_definitions;

import com.centrilli.pages.VehiclesServicesLogs_Page;
import com.centrilli.utilities.BrowserUtils;
import com.centrilli.utilities.ConfigurationReader;
import com.centrilli.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectionKey;
import java.security.Key;
import java.util.List;


public class Vehicles_Services_Logs_Definitions {
    VehiclesServicesLogs_Page vehiclesServicesLogs_page = new VehiclesServicesLogs_Page();

    @Given("user logged in as a posmanager")
    public void user_logged_in_as_a_posmanager() {
        String url = ConfigurationReader.getProperty("centrilli.url");
        Driver.getDriver().get(url);
        vehiclesServicesLogs_page.login();

    }


    @And("user clicks Fleet")
    public void user_clicks_fleet() throws InterruptedException {
        /*Thread.sleep(3000);
        Select select=new Select(vehiclesServicesLogs_page.moreDropdown);
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

         */
        if (vehiclesServicesLogs_page.moreDropdown.isDisplayed()) {
            Thread.sleep(1000);
            vehiclesServicesLogs_page.moreDropdown.click();
            Thread.sleep(1000);
            vehiclesServicesLogs_page.selectFleet.click();
        } else {
            Thread.sleep(1000);
            vehiclesServicesLogs_page.selectFleet.click();
        }

    }

    @Then("user clicks the Vehicles Services Logs module button")
    public void user_clicks_the_vehicles_Services_Logs_module_button() throws InterruptedException {

        Thread.sleep(1000);
        vehiclesServicesLogs_page.moduleVSL.click();

    }

    @When("user clicks Create button to register")
    public void user_clicks_create_button_to_register() throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.createButton.click();
    }

    @When("user clicks Vehicle button")
    public void user_clicks_vehicle_button() {

        //vehiclesServicesLogs_page.vehicleField.sendKeys();

        //Select select = new Select(vehiclesServicesLogs_page.vehicleField);
        //select.selectByVisibleText(string);
        //vehiclesServicesLogs_page.vehicleField.getText();
    }

    @When("user should be able to car model as {string}")
    public void user_should_be_able_to_car_model_as(String string) throws InterruptedException {

        vehiclesServicesLogs_page.vehicleField.click();

        Thread.sleep(1000);
        vehiclesServicesLogs_page.vehicleField.sendKeys(string);
        Thread.sleep(1000);
        //vehiclesServicesLogs_page.vehicleField.sendKeys(Keys.ARROW_DOWN);
        //Thread.sleep(1000);
        vehiclesServicesLogs_page.vehicleField.sendKeys(Keys.ENTER);


    }

    @When("user clicks Save button")
    public void user_clicks_save_button() throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.saveButton.click();


    }

    @Then("user sees the {string} on the page")
    public void user_sees_the_on_the_page(String expected) {

        String actual = vehiclesServicesLogs_page.vehicleTittle.getText();

        Assert.assertEquals(expected, actual);


    }

    @Then("this alert message should be displayed {string}")
    public void this_alert_message_should_be_displayed(String expected) {
        vehiclesServicesLogs_page.invalidErrorTittle.isDisplayed();

        String actual = (vehiclesServicesLogs_page.invalidErrorTittle.getText()) +
                (vehiclesServicesLogs_page.invalidErrorContent.getText());

        //System.out.println(actual2);
        Assert.assertEquals(expected, actual);

    }

    @When("user clicks Discard button")
    public void user_clicks_discard_button() {
        vehiclesServicesLogs_page.discardButton.click();
    }

    @Then("user sees the {string}")
    public void user_sees_the(String expected) {
        String actual = vehiclesServicesLogs_page.getModuleVSLTittle.getText();
        Assert.assertEquals(expected, actual);
    }

    @When("user sees this warning message {string}")
    public void user_sees_this_warning_message(String expected) {
        String actual = (vehiclesServicesLogs_page.warningText.getText());
        Assert.assertEquals(expected, actual);

    }

    @When("user clicks Ok button")
    public void user_clicks_ok_button() {
        vehiclesServicesLogs_page.okButton.click();
    }

    @When("user clicks Cancel button")
    public void user_clicks_cancel_button() {
        vehiclesServicesLogs_page.cancelButton.click();

    }

    @Then("user can not cancel creating so user can not back to Vehicles Services Logs")
    public void user_can_not_cancel_creating_so_user_can_not_back_to() {

    }

    @Then("user sees page title is changed to the {string}")
    public void user_sees_page_title_is_changed_to_the(String expected) {
        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(expected, actual);
    }

    @Then("{string} button is displayed at the top of the page")
    public void button_is_displayed_at_the_top_of_the_page(String expected) {
        if (expected.equals("Attachment")) {

            String actual = vehiclesServicesLogs_page.attachmentButton.getText();
            System.out.println(actual);
            Assert.assertEquals(expected, actual);

        } else if (expected.equals("Action")) {

            String actual = vehiclesServicesLogs_page.actionButton.getText();
            System.out.println(actual);
            Assert.assertEquals(expected, actual);

        } else {
            System.out.println("Invalid value");
        }


    }

    @When("user enters vehicle {string}")
    public void user_enters_vehicle(String string) throws InterruptedException {
        vehiclesServicesLogs_page.vehicleField.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.vehicleField.sendKeys(string);
        Thread.sleep(1000);
        vehiclesServicesLogs_page.vehicleField.sendKeys(Keys.ENTER);
    }

    @When("user enters service type {string}")
    public void user_enters_service_type(String string) throws InterruptedException {
        vehiclesServicesLogs_page.typeField.click();
        Thread.sleep(1000);
//        vehiclesServicesLogs_page.typeField.sendKeys(Keys.ARROW_DOWN);
//        Thread.sleep(1000);
//        vehiclesServicesLogs_page.typeField.sendKeys(Keys.ARROW_DOWN);
        vehiclesServicesLogs_page.typeField.clear();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.typeField.sendKeys(string);
        Thread.sleep(1000);
        vehiclesServicesLogs_page.typeField.sendKeys(Keys.ENTER);
    }

    @When("user enters total price {int}")
    public void user_enters_total_price(Integer int1) throws InterruptedException {
        vehiclesServicesLogs_page.totalPrice.clear();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.totalPrice.sendKeys(int1 + "");

    }

    @When("user enters date {string}")
    public void user_enters_date(String string) throws InterruptedException {
        vehiclesServicesLogs_page.date.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.dateTimePicker(string);
    }

    @When("user enters purchaser {string}")
    public void user_enters_purchaser(String string) throws InterruptedException {
        vehiclesServicesLogs_page.purchaser.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.purchaser.clear();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.purchaser.sendKeys(string);
        Thread.sleep(1000);
        vehiclesServicesLogs_page.purchaser.sendKeys(Keys.ENTER);
    }

    @When("user enters vendor {string}")
    public void user_enters_vendor(String string) throws InterruptedException {
        vehiclesServicesLogs_page.vendor.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.vendor.clear();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.vendor.sendKeys(string);
        Thread.sleep(1000);
        vehiclesServicesLogs_page.vendor.sendKeys(Keys.ENTER);
    }

    @When("user enters invoice reference {int}")
    public void user_enters_invoice_reference(Integer int1) throws InterruptedException {
        vehiclesServicesLogs_page.invoiceReference.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.invoiceReference.clear();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.invoiceReference.sendKeys(int1 + "");
    }

    @When("user enters notes {string}")
    public void user_enters_notes(String string) {
        vehiclesServicesLogs_page.notes.sendKeys(string);
    }


    @When("user returns to the Vehicle Services Logs List by clicking the Vehicles Services Logs button")
    public void user_returns_to_the_vehicle_services_logs_list_by_clicking_the_vehicles_services_logs_button() throws InterruptedException {
        vehiclesServicesLogs_page.moduleVSL.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.advancedSearch.click();
    }

    @When("user enters below data in the search box along with filters on the Filters pageside.")
    public void user_enters_below_data_in_the_search_box_along_with_filters_on_the_filters_pageside() {
        vehiclesServicesLogs_page.filters.click();
    }

    @When("user clicks Advanced Search... button")
    public void user_clicks_advanced_search_button() {
        vehiclesServicesLogs_page.advancedSearch.click();
    }

    @Then("user sees the {string} Services Logs value.")
    public void user_sees_the_services_logs_value(String string) {
        vehiclesServicesLogs_page.newCreatedVehicle.isDisplayed();
        String actual=vehiclesServicesLogs_page.newCreatedVehicle.getText();
        Assert.assertEquals(actual,string);

    }

    @When("user adds vehicle {string}")
    public void user_adds_vehicle(String string) throws InterruptedException {
        vehiclesServicesLogs_page.addCustomFilter.click();
        vehiclesServicesLogs_page.filterDropdown1.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.filterDropdown1.sendKeys("Vehicle");
        Thread.sleep(1000);
        vehiclesServicesLogs_page.filters.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.filters.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter.click();
        vehiclesServicesLogs_page.filterDropdown2.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.filterDropdown2.sendKeys(string);
        vehiclesServicesLogs_page.apply1.click();


    }

    @When("user adds service type {string}")
    public void user_adds_service_type(String string) throws InterruptedException {
        vehiclesServicesLogs_page.addCustomFilter2.click();
        vehiclesServicesLogs_page.filterDropdown3.click();
        vehiclesServicesLogs_page.filterDropdown3.sendKeys("Type");
        Thread.sleep(2000);
        vehiclesServicesLogs_page.addCustomFilter2.click();
        vehiclesServicesLogs_page.addCustomFilter2.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.filterDropdown4.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.filterDropdown4.sendKeys(string);
        Thread.sleep(1000);
        vehiclesServicesLogs_page.apply2.click();


    }

    @When("user adds total price {int}")
    public void user_adds_total_price(Integer int1) throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter3.click();
        vehiclesServicesLogs_page.filterDropdown5.click();
        vehiclesServicesLogs_page.filterDropdown5.sendKeys("Total Price");
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter3.click();
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter3.click();
        vehiclesServicesLogs_page.filterDropdown6.click();
        vehiclesServicesLogs_page.filterDropdown6.clear();
        vehiclesServicesLogs_page.filterDropdown6.sendKeys(int1 + "");
        vehiclesServicesLogs_page.apply3.click();


    }

    @When("user adds date {string}")
    public void user_adds_date(String string) throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter4.click();
        vehiclesServicesLogs_page.filterDropdown7.click();
        vehiclesServicesLogs_page.filterDropdown7.sendKeys("Date");
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter4.click();
        Thread.sleep(1000);

        vehiclesServicesLogs_page.addCustomFilter4.click();
        vehiclesServicesLogs_page.filterDropdown8.click();
        vehiclesServicesLogs_page.filterDropdown8.clear();
        vehiclesServicesLogs_page.filterDropdown8.sendKeys(string);
        vehiclesServicesLogs_page.filterDropdown8.sendKeys(Keys.TAB);
        vehiclesServicesLogs_page.apply4.click();

    }

    @When("user adds purchaser {string}")
    public void user_adds_purchaser(String string) throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter5.click();
        vehiclesServicesLogs_page.filterDropdown9.click();
        vehiclesServicesLogs_page.filterDropdown9.sendKeys("Purchaser");
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter5.click();
        Thread.sleep(1000);

        vehiclesServicesLogs_page.addCustomFilter5.click();
        vehiclesServicesLogs_page.filterDropdown10.click();
        vehiclesServicesLogs_page.filterDropdown10.clear();
        vehiclesServicesLogs_page.filterDropdown10.sendKeys(string);
        vehiclesServicesLogs_page.apply5.click();
    }

    @When("user adds vendor {string}")
    public void user_adds_vendor(String string) throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter6.click();
        vehiclesServicesLogs_page.filterDropdown11.click();
        vehiclesServicesLogs_page.filterDropdown11.sendKeys("Vendor");
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter6.click();
        Thread.sleep(1000);

        vehiclesServicesLogs_page.addCustomFilter6.click();
        vehiclesServicesLogs_page.filterDropdown12.click();
        vehiclesServicesLogs_page.filterDropdown12.clear();
        vehiclesServicesLogs_page.filterDropdown12.sendKeys(string);
        vehiclesServicesLogs_page.apply6.click();
    }

    @When("user adds invoice reference {int}")
    public void user_adds_invoice_reference(Integer int1) throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter7.click();
        vehiclesServicesLogs_page.filterDropdown13.click();
        vehiclesServicesLogs_page.filterDropdown13.sendKeys("Invoice Reference");
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter7.click();
        Thread.sleep(1000);

        vehiclesServicesLogs_page.addCustomFilter7.click();
        vehiclesServicesLogs_page.filterDropdown14.click();
        vehiclesServicesLogs_page.filterDropdown14.clear();
        vehiclesServicesLogs_page.filterDropdown14.sendKeys(int1 + "");
        vehiclesServicesLogs_page.apply7.click();
    }

    @When("user adds notes {string}")
    public void user_adds_notes(String string) throws InterruptedException {
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter8.click();
        vehiclesServicesLogs_page.filterDropdown15.click();
        vehiclesServicesLogs_page.filterDropdown15.sendKeys("Notes");
        Thread.sleep(1000);
        vehiclesServicesLogs_page.addCustomFilter8.click();
        Thread.sleep(1000);

        vehiclesServicesLogs_page.addCustomFilter8.click();
        vehiclesServicesLogs_page.filterDropdown16.click();
        vehiclesServicesLogs_page.filterDropdown16.clear();
        vehiclesServicesLogs_page.filterDropdown16.sendKeys(string);
        vehiclesServicesLogs_page.apply8.click();

    }


}
