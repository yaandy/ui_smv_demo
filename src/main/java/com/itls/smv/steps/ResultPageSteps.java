package com.itls.smv.steps;

import com.itls.smv.pages.ResultPage;
import net.thucydides.core.annotations.Step;

public class ResultPageSteps {
    private ResultPage resultPage;

    @Step
    public void verifyResultPageisOpened(){
        resultPage.verify();
    }
}
