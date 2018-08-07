package com.itls.smv.stepDefinitions;

import com.itls.smv.steps.LandingSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;

public class LandingStepDef {
    @Steps
    LandingSteps landingSteps;

    @Given("The landing page is opened")
    public void openAndVerifyLandingPage(){
        landingSteps.openLandingPage();
    }

    @When("I set loan options order to: amount '$loanAmount', period '$creditPeriod'")
    public void setLoandOptions(String loanAmount, String loanPeriod){

    }
}
