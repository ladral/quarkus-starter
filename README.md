# quarkusrocks

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:

```shell script
quarkus dev
```

> **_Exercise 1:_**  Visit the Quarkus DEV UI which is available in dev mode only at <http://localhost:8080/q/dev/.> 
> Can you find the REST endpoints which are already implemented?


> **_Exercise 2:_** Expose the OpenAPI specification and inspect the endpoints within the Swagger UI. 
> https://quarkus.io/guides/openapi-swaggerui#expose-openapi-specifications
> 
> Call the existing endpoint from within the Swagger UI
> 
> **Hint:** You will find the link to the Swagger UI in the quarkus DEV UI



> **_Exercise 3:_** Adjust the existing endpoint to return the Greeting DTO instead of a String message.
> 
> **Hint:** https://quarkus.io/guides/rest#declaring-endpoints-representation-content-types



> **_Exercise 4:_** Create a new API resource called TodoResource and implement an endpoint which returns a list of todos.
> The endpoint should be implemented on path /todos and should return 3 dummy todos. The Todo DTO should match to the following JSON object:
> 
>
> ```json
> {
> "id": 1,
> "todo": "Learn Quarkus",
> "completed": false,
> "userId": 26
> }
> ```
>
> **Hint:** https://quarkus.io/guides/rest#writing-endpoints



> **_Exercise 5:_** Instead of returning dummy todos, get the todos from an external service and return them. 
> 
> Use mockoon to mock the external service. 
> 
> **Hint:** Open mockoon - select file - Open local environment - open the mockoon collection from /mocks/todo_service_mock.json
> 
> **Hint:** https://quarkus.io/guides/rest-client
 

> **_Exercise 6:_** Adjust your DTO so that the /todos endpoint returns a list of the following Json object
>
> ```json
> {
> "id": 1,
> "description": "Learn Quarkus",
> "completed": false
> }
> ```
> 
> Get the todos from the external service and map the data to match the new DTO.


> **_Exercise 7:_** Use MapStruct or ModelMapper to simplify the code from exercise 6
>
> **Hint (MapStruct - setup):** https://mapstruct.org/documentation/stable/reference/html/#_apache_maven
> 
> **Hint (MapStruct - use):** https://mapstruct.org/documentation/stable/reference/html/#defining-mapper
> 
> **Hint (ModelMapper):** https://modelmapper.org/getting-started/




