Java Selenium Automation Testing Framework

This project is a modular, maintainable, and scalable automation framework using **Java**, **Selenium WebDriver**, **TestNG**, and **Maven** for functional testing of web applications.

---

## 📁 Project Structure


project-root/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       
│   └── test/
│       ├── java/
│          ├── PageObjects/             # Page Object Model classes
│          ├── Testcases/               # test cases
│          └── Utilities/               # to read config file
│       
│           
│
├── configaration/                 # Properties/config files
├── drivers/                       # WebDrivers (chrome Driver)
├── ScreenShots/                   # contains screenshot of the Application
├── test-output/                   # Test execution reports
├── testng.xml                     # TestNG suite file
└──  pom.xml                       # Maven project file



Prerequisites
Java JDK 11 or higher
Maven 
Eclipse
Chrome browser installed
Internet connection (for WebDriverManager)

Execution workflow
------------------
Clone the repository = >git clone https://github.com/prasannamj/FlipKart_Assessment.git
cd FlipKart_Assessment

Install dependencies => mvn clean install

right Click On testNG.xml file => click on run as = > testNg suite


