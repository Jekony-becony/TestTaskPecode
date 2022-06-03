# Test task

Test Task for some company(Contains of 2 ui tests and 1 api test)<br />
Link to the result video: https://drive.google.com/file/d/1yaOrLfoEcZdIL_rf9mMV8S_wiI1pTXvl/view?usp=sharing
###### What to start with:

1. Install environment and tools from corresponded block below
2. You should use such libraries:
   <br/>2.1. TestNg
   <br/>2.2. Appium
   <br/>2.3. Selenium
   <br/>2.4. Allure
   <br/>2.5. Lombok
3. Install Appium and Android Studio
4. In properties files you can edit some configuration
Default config:
<br/>4.1. url=http://127.0.0.1:4723/wd/hub
<br/>4.2. device_name=Pixel_2_API_29
<br/>4.3. platform_Version=10.0.0
<br/>4.4. avd_Android=Pixel_2_API_29
<br/>4.5. automation_name=UIAutomator2
<br/>4.6. platform_name=Android

###### Project structure:


```
src - directory with project sources
    main - directory for project main infrastructure
        java
            api  - package for work with api
            base - base ui 
            models - models to work with gson(for api)
            pages - page object classes
            resources - main resources
            utils - utils
        
    test - directory for tests infrastructure
        java
            api - api tests
            ui - ui tests
            resources - tests resources
        
target - directory where compiled files stored
      allure-results - allure results folder
.gitignore - file with git extentions (files and folders not to be stored in git)
pom.xml - file for Maven settings (dependencies, plugins, properties etc)
```