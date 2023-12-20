# Implico Automated Testing with Cucumber and Selenium WebDriver in Java.

This repository contains automated tests using Cucumber and Selenium WebDriver for the Swag Labs application.

## **Environment Setup**

### Prerequisites

JDK (Java Development Kit)       
Maven     
ChromeDriver (or WebDriver corresponding to your browser)

**JDK Installation**

_To install the JDK, follow the instructions provided by the official Oracle website._

**Maven Installation** 

To install Maven, follow the instructions provided by the official Maven website.

**ChromeDriver Configuration**

Download the ChromeDriver compatible with your Chrome version here.

## Running the Tests - Zip File

* Download the zip file
* Extract the zip file
* Open cmd
* Run tests using 'mvn test'

You can also run the tests using IDE like IntelliJ , Eclipse, VSCode.

## SLF4J Warning

During test execution, you may encounter the following SLF4J-related warning:

SLF4J: No SLF4J providers were found.
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See https://www.slf4j.org/codes.html#noProviders for further details.

This warning indicates that no SLF4J logger implementations are configured. While this warning does not affect test execution, it can be resolved by setting up an appropriate SLF4J binding for your project.

For more information, refer to [this link](https://www.slf4j.org/codes.html#noProviders).
