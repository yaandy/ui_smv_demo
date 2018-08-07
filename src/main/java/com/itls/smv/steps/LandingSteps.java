package com.itls.smv.steps;

import com.itls.smv.pages.LandingPage;

public class LandingSteps {
    LandingPage landingPage;

    public void openLandingPage() {
        landingPage.open();
        landingPage.verify();
    }
}
