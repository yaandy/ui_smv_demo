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

    @FindBy(xpath = "")
    private WebElementFacade amountDdl;
    @FindBy(xpath = "")
    private WebElementFacade periodDdl;
    @FindBy(xpath = "")
    private WebElementFacade nextBtn;

    public void verify() {
        amountDdl.withTimeoutOf(10, TimeUnit.SECONDS)
                .shouldBeVisible();
        LOGGER.info(String.format("Page %S opened. Verification pass",this.getClass().getSimpleName()));
    }
}
