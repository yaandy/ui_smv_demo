package com.itls.smv.steps;

import com.itls.smv.pages.LandingPage;
import com.itls.smv.stepDefinitions.Constants;
import net.thucydides.core.annotations.Step;

public class LandingSteps {
    LandingPage landingPage;

    @Step
    public void openLandingPage() {
        landingPage.open();
        landingPage.verify();
    }

    @Step
    public void setPeriod(String duration) {
        landingPage.getPeriodDdlWrapper().click();
        landingPage.getPeriodDivByValue(duration).click();
    }

    @Step
    public void setAmount(String amount) {
        landingPage.getAmountDdlWrapper().waitUntilClickable().click();
        landingPage.getAmountDivByValue(amount).click();
    }

    @Step
    public void setCategory(String category){
        landingPage.getCategoryDdlWrapper().click();
        String divValue = Constants.creditCategoryToCodeMap.get(category);
        landingPage.getCategoryDivByValue(divValue).click();
    }

    @Step
    public void clickNextBtn(){
        landingPage.getNextBtn().waitUntilClickable().click();
    }
}
