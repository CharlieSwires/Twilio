Items to Download
=================
ECLIPSE- MYECLIPSE
GIT :Bitbucket
flyway
MAVEN
SOURCE TREE
JREBEL
MSSQL Management Studio 
Microsoft SQL Server
TOMCAT 8
Rabbit MQ
REDIS(CACHING)
Acitivit (BPMN)
JASPER
-----STACK-----
JAVA 8
JPA
SPRING JPA (Repository)

Copy Nik's Directory Software
=============================
\\192.168.10.250\software to software

Directory Structure
===================
C/Development

/Development
total 8
drwxr-xr-x 1 Charles.Swires 1049089 0 Apr  4 11:32 DB_Migration_Tool_DEV/
drwxr-xr-x 1 Charles.Swires 1049089 0 Apr  4 11:58 Documents/
drwxr-xr-x 1 Charles.Swires 1049089 0 Apr  4 11:47 vizioncorerepository/

/vizioncorerepository
total 8
-rw-r--r-- 1 Charles.Swires 1049089 658 Apr  4 11:47 bitbucket-pipelines.yml
drwxr-xr-x 1 Charles.Swires 1049089   0 Apr  4 13:07 Spring_REST_OAuth/


Getting Database Backup
=======================
\\192.168.10.250\DatabaseBackup

Then load onto MSSQL Server

Creating Local NucleusDB
========================

Configure user sa with password Nia321000

Getting Source Code for Nucleus
===============================
Get the url from bitbucket
Copy this url to source tree and do a pull to development on c drive.
git clone https://charles_swires@bitbucket.org/nikannegaresh/vizioncorerepository.git
Put into myeclipse 2017 by creating a maven project install

Setting up Tomcat
=================
conf/context.xml

<Resource url="jdbc:sqlserver://VIZHULL036\MSSQLDEV;databaseName=NucleusDB" driverClassName="com.microsoft.sqlserver.jdbc.SQLServerDriver" 
password="Nia321000" username="sa" maxWaitMillis="10000" maxIdle="30" maxTotal="100" type="javax.sql.DataSource" auth="Container" name="jdbc/NucleusDB"/>

//VIZHULL036\MSSQLDEV is host\database

Building Nucleus
================
mvn clean install -Dspring.profiles.active=test -Dcdversion=109 -DskipTests=true

Fixing Problems
===============
Load this jar into maven
mvn install:install-file -Dfile=sqljdbc42.jar -DgroupId=com.microsoft.sqlserver -DartifactId=sqljdbc42 -Dversion=4.2 -Dpackaging=jar

In eclipse find the resources and copy
/AuthServer/src/main/resources/core.development-tw.properties
to
/AuthServer/src/main/resources/core.development-cs.properties

Go through the repos one at a time to find the properties
cs are my initials please use your own and be consistent.

Also add development-cs to
/AuthServer/src/main/resources/spring/root-context.xml
There are a couple of repos with spring

Install the Tomcat Server on Eclipse
====================================
Increase time out to 600seconds
Publish stuff and run tomcate use tomcat from Nik's directory doesn't need the new oracle license.
# Twilio
