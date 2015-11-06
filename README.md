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
##### 6.	Add <web-app header to web.xml
    a.	http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#websocket-server-deployment

##### 7.	Now we need to add Dispatcher servlet to web.xml
```xml
<servlet>
	<servlet-name>com.example</servlet-name>
	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
</servlet>

<servlet-mapping>
	<servlet-name>com.example</servlet-name>
	<url-pattern>/</url-pattern>
       </servlet-mapping>

<context-param>
	<param-name>contextConfigLocation</param-name>
	<param-value>/WEB-INF/example-servlet.xml</param-value>
</context-param>

<listener>
	<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
</listener>
```

##### 8.	Now we need to create com.example.servlet.xml file

```xml
<beans xmlns="http://www.springframework.org/schema/beans" xmlns:mvc="http://www.springframework.org/schema/mvc" xmlns:context="http://www.springframework.org/schema/context"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/mvc
        http://www.springframework.org/schema/mvc/spring-mvc.xsd
        http://www.springframework.org/schema/context
        http://www.springframework.org/schema/context/spring-context.xsd"
>

	<context:component-scan base-package="emporia.mvc" />

	<mvc:annotation-driven />

	<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/jsp/" />
		<property name="suffix" value=".jsp" />
</bean>
```

##### 9.	Add jsp folder with welcome.jsp file in it.

##### 10.	Add Controller
```java
package com.example.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test() {
		return "welcome";
	}
      }
```

##### 11.	Add slf4j with log4j implementation	
    a.	First add following to pom file, we need to make the commons-logging to be excluded
    b.	Read more here: http://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/#overview-not-using-commons-logging
    c.
```xml
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-core</artifactId>
		<exclusions>
			<exclusion>
				<groupId>commons-logging</groupId>
				<artifactId>commons-logging</artifactId>
			</exclusion>
		</exclusions>
	</dependency>
	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>jcl-over-slf4j</artifactId>
		<version>1.5.8</version>
	</dependency>
	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>slf4j-api</artifactId>
		<version>1.5.8</version>
	</dependency>
	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>slf4j-log4j12</artifactId>
		<version>1.5.8</version>
	</dependency>
	<dependency>
		<groupId>log4j</groupId>
		<artifactId>log4j</artifactId>
		<version>1.2.14</version>
	</dependency>
```		
    d.	Create a log4j.properties in the classpath, in /src/main/resources



