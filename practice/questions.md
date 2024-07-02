**1. Can we override or replace the embedded Tomcat server in spring boot**
`ans : Yes, we can replace the embedded tomcat with any other server by adding the starter dependencies Like: you can use 
      spring-boot-starter-jetty as a dependency for each project as you need
--> first exclude the tomact server using exclusion tag
   <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-web</artifactId>
   <exclusions>
   <exclusion>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-tomcat</artifactId>
   </exclusion>
   </exclusions>
   </dependency>
   <dependency>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-jetty</artifactId>
   </dependency>`

**2. Can we disable the default web server in the spring boot application** 
`ans : spring boot gives us the flexibility to create loosely coupled application so yes we do that by adding the 
     spring.main.web-application-type=none in application.properties file.`
**3. How to disable a specific auto-configuration class** 
`ans: you can use the exclude attribute of @EnableAutoConfiguration if you find any specific auto-configuration classes that 
     you don't want are being applied.
     // By using "exclude"
     @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})`
**4. Difference between @RestController and @Controller**
`ans: @Controller map of the model object to view or template and makes it human readable but @RestController simply 
     returns the object and object data is directly written into HTTP response as JSON or XML.`
What is the use of profiles in spring boot 
ans : 
   When developing the application for enterprise , we typically deal with environments such as Dev.QA and Prod .the 
   configuration properties for these environments are different.
   dwhdkd 

   