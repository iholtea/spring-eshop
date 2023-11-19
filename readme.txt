From O'Reilly book: Modern API Development with Spring and Spring Boot
https://learning.oreilly.com/library/view/modern-api-development/9781800562479/

Chapter 4:

Multi-layered application known also as Domain-Driven Design (DDD)
	Presentation layer - the UI interface
	Application layer - coordinates the overall flow of the application.
		Contains application logic (what is that?) but NOT the business logic
		It contains the RESTful services, async APIs, gRPC APIs, GraphQL
	Domain layer - business logic and domain information
		It contains the state of the business objects such as Order, Products
		It seems it contains the the repositories( beans that persist data) also
	Infrastructure layer - responsible for communication such as interaction with 
		the database, message brokers, filesystems. Spring Boot works as an
		infrastructure layer providing support to interact with databases, etc	
		
@Repository - represents both Spring way and Java EE DAO pattern to access a DB.

Flyway  
	helps maintain the database, keeps a database changes history that allows rollbacks, etc
	Provide the SQL script - create tables, add data in 
	V1.0.0.Init.sql file inside the src/main/resources/db/migration directory
	Flyway naming convention is V<version>__<name>.sql ex V1_0__init.sql
	
Access the H2 database: http://localhost:8080/h2-console/

Q:
	how does this work validation stuff work ? who enforces it ?
	implementation 'org.springframework.boot:spring-boot-starter-validation'
	  
	@jakarta.validation.constraints.NotNull	
	@Column(name = "username")
	private String username;
	
	
				 