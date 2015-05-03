This is an example application of my blog post:

* [Getting Started with Gradle: Integration Testing]()

You can run unit tests by running the following command at the command prompt:

    gradle test

You can run integration tests by running the following command at the command prompt:

    gradle integrationTest -x test

You can run all tests by running the following command at the command prompt:

    gradle integrationTest


You can package the application by running one of the following commands at the command prompt:

    gradle assemble (runs only the tasks required to create the jar file)
    gradle build (runs the full build)
    
You can can run the application by the following command at the command prompt:

    gradle run

You create runnable binary distribution by running one of the following commands at the command prompt:

    gradle distZip (creates a runnable binary distribution that is packaged into a .zip file)
    gradle distTar (creates a runnable binary distribution that is packaged into a .tar file)

Both of the commands creates the packaged binary distribution to the _build/distributions_ directory. 

You can run the application by following these steps:

1. Unpackage the binary distribution.
2. Run the application by invoking the correct startup script found from the _bin_ directory.    