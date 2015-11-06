# Spring MVC Template

##### 1.	Create new “Dynamic Web project” with default web.xml
##### 2.	Create standard directory using maven standard.

    a.	https://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
    
    b.	In eclipse go to project Right Click “Build Path” -> “Configure Build Path” -> source
    
    c.	Click add folder, make sure select project and click on “Create New Folder”
    
    d.	Type “/src/main/java” Enter
    
    e.	Again make sure you select the main project and click on “Create New Folder”
    
    f.	Type “/src/test/java” Enter
    
    g.	And do this for any needed new folder
    
    3.	Now  let’s configure project as Maven project
    
    a.	Right click on project and select “Configure” select “Convert to Maven Project”
    
##### 4.	Open POM  file and let’s add libraries for Spring 4

    a.	http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#overview-maven-bom
    
    b.	Add bill of materials to pom file and describes above
    
##### 5.	 Add following dependencies for minimum MVC web app

```xml 
<dependencies>
  <dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-context</artifactId>
	</dependency>
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-webmvc</artifactId>
	</dependency>
</dependencies>
```



