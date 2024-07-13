1. Can we override or replace the embedded Tomcat server in spring boot
   Ans : Yes, we can replace the embedded tomcat with any other server by adding the starter dependencies Like: you can use
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
   </dependency>

2. Can we disable the default web server in the spring boot application
   Ans : spring boot gives us the flexibility to create loosely coupled application so yes we do that by adding the
   spring.main.web-application-type=none in application.properties file.
3. How to disable a specific auto-configuration class
   Ans: you can use the exclude attribute of @EnableAutoConfiguration if you find any specific auto-configuration classes that
   you don't want are being applied.
   // By using "exclude"
   @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
4. Difference between @RestController and @Controller
   Ans: @Controller map of the model object to view or template and makes it human readable but @RestController simply
   returns the object and object data is directly written into HTTP response as JSON or XML.
5. What is the use of profiles in spring boot
   Ans :
*    When developing the application for enterprise , we typically deal with environments such as Dev.QA and Prod .the configuration properties for these environments are different.
*    For example, we might be using an embedded H2 database for Dev, but Prod could have the proprietary Oracle or DB2. Even if the DBMS is the same across environments, the URLs would definitely be different.
*    To make this easy and clean, Spring has the provision of profiles, to help separate the configuration for each environment. So that instead of maintaining this programmatically, the properties can be kept in separate files such as application-dev.properties and application- prod.properties. The default application.properties points to the currently active profile using spring.profiles.active so that the correct configuration is picked up.

6. What is URI
   A Uniform Resource Identifier (URI) is a sequence of characters that identifies a resource on the internet. A URI
   can be used to identify any type of resource, such as a web page, image, video, or specific piece of information.
   -> URL is subset of URI
7. Explain architecture of your application u worked on.
   --> Client server architecture and explain the layers(presentational,business and data access layer--> 3 tier) 
   --> business layer(logic)  can be divided into dao,controller and service layer 
8. Types of authentication 
ans : a) knowledge based : password,pin security questions
      b) possession based : access tokens, text messages in your phone, key card or badges
      c) knowledge+possession based: Multi-factor auth,login to VDI or AWS system
9. What are the core concepts of spring security
 ans: Authentication,Authorization, Principal(currently logged in user that we store in session), granted authority(group of permissions allowed for a user), roles(group of authorities that are assigned together. ex: Role: ADMIN, authorities: login, search,Create,update employee) 

10. HGow spring security intercepting your requests
ans: because of filter of servlets 
11. Types of IOC container
ans: Mainly BeanFactory and Application context
12. How to implement CORS
ans: using @CrossOrigin or Access-Control-Allow-Origin:url in your header to allow it.
13. 