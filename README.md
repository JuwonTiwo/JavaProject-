# Sky Basket (Educational project)

## About the Project 

We created this project to showcase our skills and what we have learnt in the last couple of weeks and this is a good way to share the project so you can play around with it or make changes.

## Setting up the project

### Prerequisites

1. [JDK 1.7 +](http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html)
2. [Tomkat](https://tomcat.apache.org/)
3. [Java IDE](http://www.eclipse.org) (Or one of your preference)
4. Terminal or Console

### Setting up Java Development Kit
This step involves downloading an implementation of the Java Software Development Kit (SDK) and setting up the PATH environment variable appropriately.

* You can download SDK from Oracle's Java site − Java SE Downloads.
* Once you download your Java implementation, follow the given instructions to install and configure the setup. 
* Finally set the PATH and JAVA_HOME environment variables to refer to the directory that contains java and javac, typically java_install_dir/bin and java_install_dir respectively.

If you are running Windows and install the SDK in C:\jdk1.5.0_20, you need to add the following line in your C:\autoexec.bat file.

```
set PATH = C:\jdk1.5.0_20\bin;%PATH%
set JAVA_HOME = C:\jdk1.5.0_20
```

Alternatively, on Windows NT/2000/XP, you can also right-click on My Computer, select Properties, then Advanced, followed by Environment Variables. Then, you would update the PATH value and press the OK button.

On Unix (Solaris, Linux, etc.), if the SDK is installed in /usr/local/jdk1.5.0_20 and you use the C shell, you will put the following into your .cshrc file.
```
setenv PATH /usr/local/jdk1.5.0_20/bin:$PATH
setenv JAVA_HOME /usr/local/jdk1.5.0_20
```

### Setting up Web Server: Tomcat
A number of Web Servers that support JavaServer Pages and Servlets development are available in the market. Some web servers can be downloaded for free and Tomcat is one of them.

Apache Tomcat is an open source software implementation of the JavaServer Pages and Servlet technologies and can act as a standalone server for testing JSP and Servlets, and can be integrated with the Apache Web Server. Here are the steps to set up Tomcat on your machine −

	•	Download the latest version of Tomcat from https://tomcat.apache.org/.

	•	Once you downloaded the installation, unpack the binary distribution into a convenient location. For example, in C:\apache-tomcat-5.5.29 on windows, or /usr/local/apache-tomcat-5.5.29 on Linux/Unix and create CATALINA_HOME environment variable pointing to these locations.
Tomcat can be started by executing the following commands on the Windows machine −
%CATALINA_HOME%\bin\startup.bat
 
or
 
C:\apache-tomcat-5.5.29\bin\startup.bat
Tomcat can be started by executing the following commands on the Unix (Solaris, Linux, etc.) machine −


