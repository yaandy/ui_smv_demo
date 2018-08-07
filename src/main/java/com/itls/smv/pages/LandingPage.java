package com.itls.smv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://smava.de")
public class LandingPage extends AbstractPage {
    private static final Logger LOGGER = LogManager.getLogger();
    @FindBy(id = "x-loan_selection")
    private WebElementFacade loanSelectionContainer;

    @FindBy(xpath = "//span[@id='lsAmountMobileLabel']//..")
    private WebElementFacade amountDdlWrapper;

    @FindBy(xpath = "//span[@id='lsDurationMobileLabel']//..")
    private WebElementFacade periodDdlWrapper;

    @FindBy(xpath = "//span[@id='lsCategoryMobileLabel']//..")
    private WebElementFacade categoryDdlWrapper;

    @FindBy(xpath = "//button[@id = 'loanSelectionForward']")
    private WebElementFacade nextBtn;

    @Deprecated
    public WebElementFacade getAmountDdl() {
        return findBy("//*[id='x-loan_selection']//select[@id='lsAmount']");
    }

    public WebElementFacade getAmountDivByValue(String value){
        String template = String.format("//*[@id='lsAmount']/following-sibling::div//div[@class='item' and @data-value='%s']", value);
        return findBy(template);
    }

    public WebElementFacade getPeriodDivByValue(String value){
        String template = String.format("//*[@id='lsDuration']/following-sibling::div//div[@class='item' and @data-value='%s']", value);
        return findBy(template);
    }

    public WebElementFacade getCategoryDivByValue(String value){
        String template = String.format("//*[@id='lsCategory']/following-sibling::div//div[@class='item' and @data-value='%s']", value);
        return findBy(template);
    }

    public WebElementFacade getNextBtn() {
        return nextBtn;
    }

    public WebElementFacade getAmountDdlWrapper() {
        return amountDdlWrapper;
    }

    public WebElementFacade getPeriodDdlWrapper() {
        return periodDdlWrapper;
    }

    public WebElementFacade getCategoryDdlWrapper() {
        return categoryDdlWrapper;
    }

    @Override
    public void verify() {
        loanSelectionContainer.withTimeoutOf(20, TimeUnit.SECONDS)
                .waitUntilClickable();
        LOGGER.info(String.format("Page %S opened. Verification pass",this.getClass().getSimpleName()));
    }
}
