# TASK
This instruction will guide you how to run this application with IntelliJ IDEA. 

### Lombok plugin must be installed in IntelliJ IDEA and enabled in "Preferences | Build, Execution, Deployment | Compiler | Annotation Processors" or otherwise data won't save and won't display!

You must have a running MySQL server at localhost:3306 and dbuser:dbpassword must have access to it or alternatively you can change login details in src/main/resources/application.properties 

To run the back-end run src\main\java\com\olkoro\demo\DemoApplication.java
 
To run the front-end navigate to /Angular in terminal
```
cd Angular
```
Install node modules (if it doesn't work install Node.js)
```
npm install
```
Then start it with this command (if it doesn't work install Angular CLI)
```
ng serve
```
You now should be able so acces the web app on http://localhost:4200/ 

And rest api on http://localhost:8080/masters/all, http://localhost:8080/services/all and http://localhost:8080/reservations/all      
If everything is done right you will see 3 entries in the table 
