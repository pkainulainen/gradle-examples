This is an example application of my blog post: 

* [Getting Started with Gradle: Dependency Management](http://www.petrikainulainen.net/programming/gradle/getting-started-with-gradle-dependency-management/)

You can package the application by running one of the following commands at command prompt:

    gradle assemble (runs only the tasks required to create the jar file)
    gradle build (runs the full build)

Both commands create a jar file called _dependency-management.jar_ to the _build_ directory.
    
You can run the application by running the following command at command prompt:

    java -jar dependency-management.jar
