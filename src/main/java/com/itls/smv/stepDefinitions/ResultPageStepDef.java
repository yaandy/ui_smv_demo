package com.itls.smv.stepDefinitions;

import com.itls.smv.steps.ResultPageSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;

public class ResultPageStepDef {
    @Steps
    private ResultPageSteps resultPageSteps;

    @Then("Result page is completely loaded")
    public void resultPageIsLoaded(){
        resultPageSteps.verifyResultPageisOpened();
    }

}
