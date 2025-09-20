This is a basic API Automation project built using Java, REST Assured, and JUnit 5.
It demonstrates simple GET and POST API tests using the free public API  JSONPlaceholder
.

 Project Structure
restassured-demo
 ├── pom.xml
 └── src
     └── test
         └── java
             └── tests
                 └── ApiTest.java

⚙️ Tech Stack

Java 11+

Maven – build & dependency management

JUnit 5 – test framework

REST Assured – API testing library

 How to Run Tests

Clone the repository:

git clone https://github.com/<your-username>/restassured-demo.git
cd restassured-demo


Run tests using Maven:

mvn clean test

 Sample Tests
🔹 GET /posts/1

Validate status code = 200

Validate id == 1

Validate response contains a non-empty title

🔹 POST /posts

Send JSON body:

{
  "title": "SDET Portfolio",
  "body": "Rest Assured project",
  "userId": 101
}


Validate status code = 201

Validate response title == "SDET Portfolio"

Validate response userId == 101

 Test Reports

After running tests, Maven Surefire generates reports under:

target/surefire-reports/


You can open them to see detailed execution results.

 Why this project?

Kickstart for API Automation with REST Assured

Ready-to-use Maven project structure

Can be extended with:

TestNG / JUnit parameterization

Data-driven tests

CI/CD integration (GitHub Actions, Jenkins)
