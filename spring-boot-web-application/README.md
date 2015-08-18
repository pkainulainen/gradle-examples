This is an example application of my blog post:

* [Getting Started with Gradle: Creating a Spring Boot Web Application Project](http://www.petrikainulainen.net/programming/gradle/getting-started-with-gradle-creating-a-spring-boot-web-application-project/)

You can run unit tests by running the following command at the command prompt:

    gradle clean test

You can run integration tests by running the following command at the command prompt:

    gradle clean integrationTest

You can run all tests by running the following command at the command prompt:

    gradle clean test integrationTest
    
You can run the full build (that runs all tests) by running the following command at the command prompt:

    gradle clean build

You can can run the Spring Boot web application by the following command at the command prompt:

    gradle bootRun
    
When the application is running, you can access it by going to the url address:

    http://localhost:8080