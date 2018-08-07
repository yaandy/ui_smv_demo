
This is Serenity based UI automation solution.
Project follows default structure of Serenity Framework http://thucydides.info/docs/serenity-staging/
Tests are implemented in BDD style, the same solutions as well supports Junit
based implementation that does not require two additonal level of abstraction(Step def. and story files)

Env:
Tested with Chrome v.68 vs ChromeDriver v.2.41(supports 67-69)

Run:
mvn clean verify -PChrome
!!!Note profile is used for switching browser

Reporting:
Report is located -> /target/site/serenity/index.html