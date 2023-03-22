package com.centrilli.step_definitions;

import com.centrilli.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //import from io.cucumber.java not from junit
    @Before
    public void setUpScenario() {
       // System.out.println("====Setting up browser using cucumber @Before");

    }
    @Before ()
    public void setUpScenarioForLogins() {
        //System.out.println("====This will only apply to scenarios with @login tag");

    }
    @Before ()
    public void setUpDatabaseScenario() {
        //System.out.println("====This will only apply to scenarios with @db tag");

    }

    @After
    public void tearDownScenario(Scenario scenario) {

        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot,"image/png", scenario.getName());

        }



        Driver.closeDriver();

        // System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/Take screenshot if failed!");
    }

    @BeforeStep
    public void setUpStep() throws InterruptedException {
        Thread.sleep(3000);
        //System.out.println("----->applying setup using @BeforeStep");
    }

    @AfterStep
    public void afterStep() throws InterruptedException {
       // System.out.println("----->applying tearDown using @AfterStep");
    }

}
