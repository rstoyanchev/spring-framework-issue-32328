This is just an example to assist the discussion on https://github.com/spring-projects/spring-framework/issues/32328.

The logic within this project is not meant to make any sense further than illustrate the usage of the discussed annotations.

The project is separated in different apps:
* Common Lib: provides generic API definitions and abstract classes so other apps can reuse them (Book App in this case). 
* Book App: manages and serves books.
  * Run: `./gradlew :book-app:book-server:bootRun`
  * Test: `./gradlew :book-app:book-server:test`
  * Curl example: `curl localhost:8081/books`
* Store App: centralizes item access by customers. Acts as a client of the Book App.
  * Run: `./gradlew :store-app:store-server:bootRun`
  * Test: `N/A`
  * Curl example: `curl localhost:8080/store/mystore`
* Monolith App: groups all apps in a "single executable/server" so it can be deployed in simple setups.
  * Run: `./gradlew :monolith-app:monolith-server:bootRun`
  * Test: `./gradlew :monolith-app:monolith-server:test`
  * Curl examples: `curl localhost:8080/store/mystore`, `curl localhost:8080/books`
 
