	
From O'Reilly book Modern API Development with Spring and Spring Boot
https://learning.oreilly.com/library/view/modern-api-development/9781800562479/

Code for the examples from the book:
https://github.com/PacktPublishing/Modern-API-Development-with-Spring-and-Spring-Boot

Chapter 3 - Design APIs with OAS - OpenAPI Specification

Using a design-first approach.
You can write a specification of the APIs using YAML or JSON
https://github.com/OAI/OpenAPI-Specification/
We will use version 3:
https://github.com/OAI/OpenAPI-Specification/tree/main/versions

OAS was earlier known as Swagger Specification.
OAS-supporting tools are still known as Swagger tools

Swagger Editor: 
	https://editor.swagger.io/ for designing and describing the API

Swagger Codegen: 
	https://github.com/swagger-api/swagger-codegen 
	for generating the API interface( or maybe some dummy implementation ?)
	To generate Spring/Java based API interface there are Gradle plug-ins( we'll use the first one) :
	https://github.com/int128/gradle-swagger-generator-plugin
	https://github.com/OpenAPITools/openapi-generator/tree/master/modules/openapi-generator-gradle-plugin

Swagger UI : 
	https://swagger.io/tools/swagger-ui/ to generate REST API documentation

Note: 
	when creating a openapi.yaml to contain our API description use https://editor.swagger.io/
	as it will give meaningful error messages if we have mistakes. 

	More info on customizing the generated code using the configuration(config.json):
	https://github.com/swagger-api/swagger-codegen#customizing-the-generator

Gradle task to generate the API code
	./gradlew generateSwaggerCode

Problems with the generated code :
	It will make use of the following imports which are not on the classpath because
	package names were change from javax to jakarta at some point, so generated code needs manual fixes:

	import javax.xml.bind.annotation.*;
	import javax.validation.Valid;
	import javax.validation.constraints.*;

Testing:
	curl --request GET 'http://localhost:8080/api/v1/hello' --header 'Accept: application/json'
	curl --request GET 'http://localhost:8080/api/v1/customers' --header 'Accept: application/xml'
	curl --request GET 'http://localhost:8080/api/v1/customers/1' --header 'Accept: application/xml'





