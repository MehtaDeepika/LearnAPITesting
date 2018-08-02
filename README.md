# LearnAPITesting
This project creates a Rest API using java spring boot for storing and retriving employee data in below format, currently the data is 
stored in java data structure and HTTP methods : GET, POST, PUT and DELETE are implemented

Employee :{ 
"id" : 1,
"name" : "Jasper",
"company" : "JasperTech"
}

Can be accessed at
Get all Employees : http://localhost:8080/employee ---> Output : 0 or more
Get Employee for Id : http://localhost:8080/employee/{id} ----> Output : Empoyee with id , if absent it returns (? YTW)
Post Employee : http://localhost:8080/employee ---> Output: Empoyee with id is created , (? YTW on the response)

      Payload : {
                  "id" : 1,
                  "name" : "Jasper",
                   "company" : "JasperTech"
                }

Put Employee : http://localhost:8080/employee ---> Output: Empoyee with id is created, if present it is updated, (? YTW on the response)
      Payload : {
                  "id" : 1,
                  "name" : "Jasper",
                   "company" : "JasperTech"
                }

Next Steps:
Create a DB and connect to it from DAO layer



