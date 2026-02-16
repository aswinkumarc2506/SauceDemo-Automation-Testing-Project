SauceDemo Automation Testing Project
📌 Project Overview

This project is a Selenium Automation Testing Framework developed using Java, Maven, and TestNG to automate test scenarios of the SauceDemo web application provided by Sauce Labs.

The framework follows the Page Object Model (POM) design pattern to maintain clean structure, reusability, and scalability.

🚀 Technologies Used

Java

Selenium WebDriver

TestNG

Maven

Page Object Model (POM)

Eclipse IDE

🏗️ Project Structure
SauceDemoAutomation
│── src/main/java
│     ├── base
│     │     └── BaseTest.java
│     ├── pages
│     │     ├── LoginPage.java
│     │     └── HomePage.java
│
│── src/test/java
│     └── tests
│           ├── LoginTest.java
│           └── CartTest.java
│
│── pom.xml
│── test-output (TestNG Reports)

📂 File Explanation
🔹 BaseTest.java

Initializes WebDriver.

Opens browser.

Manages setup and teardown methods.

Acts as parent class for all test classes.

🔹 LoginPage.java

Contains web element locators for login page.

Methods to enter username, password, and click login.

Follows Page Object Model.

🔹 HomePage.java

Contains elements related to products page.

Methods for adding items to cart.

Navigation handling after login.

🔹 LoginTest.java

Verifies login functionality.

Tests valid login scenario.

🔹 CartTest.java

Tests adding products to cart.

Validates cart functionality.

🔹 pom.xml

Maven configuration file.

Manages dependencies like Selenium and TestNG.

🔹 test-output

Contains automatically generated TestNG reports.

Includes HTML execution reports.

🧠 Framework Design Pattern

This project uses:

✅ Page Object Model (POM)

Separates test logic and page elements.

Improves maintainability.

Reduces code duplication.

▶️ How to Run the Project

Clone the repository

git clone <your-repo-link>


Open in Eclipse / IntelliJ

Update Maven dependencies

Right Click → Maven → Update Project


Run test classes:

Right click on LoginTest.java

Click Run As → TestNG Test

OR

Run using Maven:

mvn clean test

📊 Features Implemented

Browser setup & teardown

Login automation

Add to cart automation

TestNG execution reports

Organized project structure

Reusable page classes

🎯 Key Learning Outcomes

Selenium WebDriver automation

Handling locators (By.id, By.xpath, etc.)

TestNG annotations (@Test, @BeforeMethod, @AfterMethod)

Maven dependency management

Automation framework structure

Real-time test execution reporting

📈 Future Enhancements

Add Data-Driven Testing

Implement Cross-Browser Testing

Add Extent Reports

Integrate with Jenkins (CI/CD)

Add Screenshot capture on failure
