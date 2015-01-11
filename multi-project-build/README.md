This is an example application of my blog post:

* [Getting Started with Gradle: Creating a Multi-Project Build](http://www.petrikainulainen.net/programming/gradle/getting-started-with-gradle-creating-a-multi-project-build/)

You can package the application by running one of the following commands at command prompt:

    gradle assemble (runs only the tasks required to create the jar file)
    gradle build (runs the full build)
    
You can can run the application by the following command at command prompt:

    gradle run

You create runnable binary distribution by running one of the following commands at command prompt:

    gradle distZip (creates a runnable binary distribution that is packaged into a .zip file)
    gradle distTar (creates a runnable binary distribution that is packaged into a .tar file)

Both of the commands creates the packaged binary distribution to the _app/build/distributions_ directory.

You can run the application by following these steps:

1. Unpackage the binary distribution.
2. Run the application by invoking the correct startup script found from the _bin_ directory.    