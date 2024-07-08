# |MakeMyTrip| Automate Testing With Selenium
## Introduction
To build a Selenium script that automates the process of logging into an OrangeHRM website to handle dynamic dropdowns, dropdowns, and web tables.
## Scopes
Book a hotle in MakeMyTrip Web Application
### Used Ftamework
1. Cucmber BDD
2. Page Object Model
3. Screenshot capture of test failure
4. HTML report generator
5. Parallel testing
6. Cross-browser capable
7. Logging feature for debugging purposes
8. Retry mechanism for faild cases
### Setup Environment
Install Java, IDE(Eclipse)
### Create A maven project
Open your IDE and create a Maven Project. 
Your Project structure should look like this:
![image](https://github.com/janasagar/Evaluation_Submission_Sagar-Jana/assets/172262154/1048e7b8-9be9-4b5c-bf66-d65dcfe6aaf4)

Go to Your pom.xml and Maven dependencies.
TestNG, Selenium-Java, WebDriverManager, Cucumber, Cucumber-testng, Cucumber-junit
### Code Structure
![image](https://github.com/janasagar/Evaluation-3/assets/172262154/ee567ce4-f154-4f93-8ec2-2a0cfac48306)

```src/test/jave``` -> ```Runner``` package helps to execute script by Testng or Junit class
```src/test/jave``` -> ```step_def``` package conatains your operation or methods.
```src/test/resources/makemytrip``` conatains the ```.feature``` file where you write your test cases

## Getting started with |MakeMyTrip| Automate Testing With Selenium
Install [git](https://www.git-scm.com/)  in your system
Paste this command
```bash
git clone https://github.com/janasagar/Evaluation-3.git
```
Open your IDE, click on `file` the click on  `Open projects from file system`

Go to `src/test/java` and triger yor runner class.
Note: Please verify You have same browser which is mentioned in the script.
example:
```bash
WebDriverManager.chromedriver().setup();// setup our chrome driver
		driver = new ChromeDriver(); //set driver to chromedriver
```



