# Test task

Test Task for some company(Contains of 5 ui tests(1 failed))<br />
Link to the result video: https://drive.google.com/file/d/1F397KR1Xq5vDhDsbFZ_Rnh2aCIGBeBIw/view?usp=sharing
Or you can see result in result package (screeenshots & video)

###### What to start with:

1. Install environment and tools from corresponded block below
2. You should use such libraries:
   <br/>2.1. TestNg
   <br/>2.2. WebDriverManager
   <br/>2.3. Selenium
   <br/>2.4. Allure
   <br/>2.5. Lombok
   <br/>2.6. Aeonbits
4. In properties files you can edit some configuration
   <br/>Default config:
   <br/>4.1. username=username
   <br/>4.2. password=password
   <br/>4.3. allure.results.directory=target/allure-results

###### Project structure:

```
src - directory with project sources
    main - directory for project main infrastructure
        java
            base - base ui(Driver class)
            pages - page object classes + ErrorMessage class
            utils - utils
            resources - main resources
            
        
    test - directory for tests infrastructure
        java
            ui - ui tests
            resources - tests resources
        
target - directory where compiled files stored
      allure-results - allure results folder
.gitignore - file with git extentions (files and folders not to be stored in git)
pom.xml - file for Maven settings (dependencies, plugins, properties etc)
```
If u have any questions or advices you can contact me:
<br/>Telegram: @kupu_kupu_p
