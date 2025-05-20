# Selenium Automated Test Scripts for Practice Website

This repository contains automated test scripts written using Selenium WebDriver. These tests target a practice website to demonstrate automation testing.

## Project Overview

- **Automation Tool:** Selenium WebDriver  
- **Purpose:** Automate functional testing on a practice website  
- **CI/CD:** Integrated and deployed through Jenkins pipeline

## Features

- Automated browser interactions to validate website functionality  
- Continuous integration and deployment with Jenkins for seamless test execution

## Prerequisites

- Java installed  
- Selenium WebDriver dependencies  
- Jenkins installed and configured  
- Git installed for cloning repo  

## How to Run Locally

1. Clone the repository  
   ```bash
   git clone <https://github.com/prateekv-123/java-program-jenkin>
2. Set up Selenium dependencies (e.g., install required packages)
3. Run the test scripts manually using eclipse IDE or command line

## Jenkins CI/CD Pipeline Setup

- Jenkinsfile included to automate the build and test execution 
- Pipeline triggers tests on every commit or scheduled intervals
- Reports generated post execution

## How to Deploy

- Configure Jenkins job to pull from this repository
- Set build triggers (poll SCM or webhook)
- Execute pipeline to run tests automatically
