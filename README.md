CloudBuild Pipeline for deploying a JAVA based web application on App Engine Service
=================================================================================
Any changes push to GitHub main branch it automatically build and deploy the code to App Engine

Command to deploy on cloud from local:
==========================
mvn clean package appengine:deploy

Files:
==========================
*cloudbuild.yaml* - A build config file defines the fields that are needed for Cloud Build to perform your tasks.
The steps section in the build config file contains the build steps that you want Cloud Build to perform.


*app.yaml* (src/main/appengine) - Contains app engine configuration like JAVA version, service name, instance class and service account.


*application.properties* (src/main/resources) - File contains the different configuration which is required to run the application SQL configuration. 


