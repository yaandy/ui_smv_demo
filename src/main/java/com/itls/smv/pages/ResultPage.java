package com.itls.smv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.concurrent.TimeUnit;

public class ResultPage extends AbstractPage {
    @FindBy(xpath = "(//*[contains(@class, 'loan-selection__value')])[1]")
    private WebElementFacade loanRatesPercent;
    @FindBy(xpath = "(//*[contains(@class, 'loan-selection__value')])[2]")
    private WebElementFacade loanRatesMoney;

    @FindBy(xpath = "//button[@type='submit' and contains(@class, 'next')]")
    private WebElementFacade nextBtn;

    @Override
    public void verify() {
        loanRatesPercent.withTimeoutOf(10, TimeUnit.SECONDS).shouldBeVisible();
        loanRatesMoney.shouldBeVisible();
        nextBtn.shouldBeEnabled();
    }
}
