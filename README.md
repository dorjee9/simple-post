#steps to set up simple-post project:-
1) add following spring-boot-starter-parent dependency in pom.xml
   <parent>
   <groupId>org.springframework.boot</groupId>
   <artifactId>spring-boot-starter-parent</artifactId>
   <version>3.2.5</version>
   <relativePath/> <!-- lookup parent from repository -->
   </parent>
2) add following dependency in pom.xml
   spring-boot-starter
3) add plugin spring-boot-maven-plugin under build in pom.xml
4) add application.properties inside the resources folder
5) create Main class and define class annotation "@SpringBootApplication"
6) pass the main method args to SpringApplication.run(SimplePostApplication.class, args);
7) create test class for Main and define class annotation SpringBootTest
8) create method contextLoads and define method annotation @Test
9) run the reload project maven command
10) create model class namely PostData with getter & setter methods for variable message without final.
11) create a controller class and define annotation @RestController & @RequestMapping("api"). Note: add spring-boot-starter-web dependency in pom.xml
12) create method for post message and define method annotation @PostMapping("/post")
13) add parameter for PostData data type and define parameter annotation @RequestBody
14) to return output as response body from method. I've used ResponseEntity to return a 
more flexible response. This allows us to specify the HTTP status code along with the response body. 
Here, ResponseEntity.ok() indicates a successful response with status code 200 (OK). You can change 
this according to your needs, for example, ResponseEntity.created() for POST requests that create resources,
ResponseEntity.badRequest() for invalid requests, etc.
15) Run the  following command to send a post request on terminal:-
    curl -X POST http://localhost:8080/api/post -H "Content-Type: application/json" -d '{"message":"Hello, Spring Boot!"}'
16) Run 'maven install' command to build a jar file
