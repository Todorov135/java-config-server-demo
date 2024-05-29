# **JAVA-CONFIG-SERVER-DEMO** 
Simple project for configuring database properties for demo-server from separated server.

### The purpose is:

1. Avoiding duplication,

2. Centralising of options.  

App struct:
-   config-server - configuration server used dependency
`'org.springframework.cloud:spring-cloud-config-server'`
-   config-server-values - repository, that store configuration values. Can be found here: https://github.com/Todorov135/java-config-server-values
- demo-server - configuration client used dependencies:

`
'org.springframework.boot:spring-boot-starter-data-jpa'
'org.springframework.boot:spring-boot-starter-web'
'org.springframework.cloud:spring-cloud-starter-config'
'org.projectlombok:lombok'
'org.postgresql:postgresql'
'org.projectlombok:lombok'
`


References used:
- Spring Cloud Config - https://docs.spring.io/spring-cloud-config/docs/current/reference/html/
- Microservices tutorial with Spring boot 3 - https://www.youtube.com/watch?v=KJ0cSvYj41c&t=3335s&ab_channel=BoualiAli


