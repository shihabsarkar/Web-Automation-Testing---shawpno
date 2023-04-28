# Web-Automation-Testing---shawpno
I tested some functionality of a website named Shawpno using Selenium
An automation testing is done of a web application "Shawpno" using Automation Testing tool Selenium. It is a short project focusing on some functionality of the application.
I used POM to complete the project. Different classes are created for corresponding web pages.
First of all I created a "DriverSetup" class in utilities package. In this class I prepared the driver setup, browswes to be used and annotations.
Then I created a class "BasePage" in the webpages package where I have defined all the necessary methods which are inherited in other classes.
There there are "ShawpnoComplainPage", "ShawpnoHomePage" and "ShawpnoLoginPage" where I have performed automation testing on Login, posting complain.
Also permormed some assertions like checking homepage title, homepage link.
This project can be run using Testng parallely at method level.
Finally, I have produced allure report of the tests.
