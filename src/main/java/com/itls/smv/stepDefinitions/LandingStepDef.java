package com.itls.smv.stepDefinitions;

import com.itls.smv.steps.LandingSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class LandingStepDef {
    @Steps
    LandingSteps landingSteps;

    @Given("The landing page is opened")
    public void openAndVerifyLandingPage(){
        landingSteps.openLandingPage();
    }

    @When("I set loan options order to: amount '$loanAmount', period '$creditPeriod', category: '$category'")
    public void setLoandOptions(String loanAmount, String loanPeriod, String category){
        landingSteps.setAmount(loanAmount);
        landingSteps.setPeriod(loanPeriod);
        landingSteps.setCategory(category);
    }

    @When("I click on Next Btn")
    public void clickOnNextBtn(){
        landingSteps.clickNextBtn();
    }
}
