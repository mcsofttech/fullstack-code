# full-stack-coding-challenge
1. for the encoding question, import the encode folder into eclipse as existing maven project, make sure the eclipse is the latest or 1.8, 
on the command line (if you are using windows), install maven and go to the folder where pom.xml exist, and do mvn clean install.
on the Eclipse, clean and build the project, then right click on 
/encoder/src/main/java/com/course/springboot/encoder/EncoderApplication.java
to run the REST web service
if you want to change the port, please change the port in this file:
/encoder/src/main/resources/application.properties

then on the postmane or chrome rest api client, 
do a POST, URL: http://localhost:23456/api/encode 
e.g. JSON msg, 
{"Shift":5,"Message":"Derek is cool"}
and you should get back
{
    "encodedMessage": "Ijwjp nx httq"
}
and a file with name {random string}-{key} will be created in the same place where pom.xml located

Please see the screenshot1.png for the test on postman

2. for the sign up, simply open the signup.html on chrome or whatever browser
note the round corner 2px requirements has been taken care by the bootstrap's border radius 4px
