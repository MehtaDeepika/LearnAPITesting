package com.sapient.model;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.Test;


public class GreetingControllerTests {
    @Test
    public void noParamGreetingShouldReturnDefaultMessage() throws Exception {
                baseURI = "http://localhost:8080/";
                System.out.println("Started Test Default");
                given().
                when().get("greeting").
                then().
                statusCode(200).and().contentType(ContentType.JSON).and().body("content",equalTo("Hello, World!"));
    }

    @Test
    public void paramGreetingShouldReturnTailoredMessage() throws Exception {
                baseURI = "http://localhost:8080/";
                System.out.println("Started Test Custom");
                given().
                queryParam("name","Deepika").
                when().get("greeting").
                then().
                body("content",equalTo("Hello, Deepika!"));
    }

    @Test
    public void idValueForGreetingShouldReturnANumber() throws Exception {
        baseURI = "http://localhost:8080/";
        System.out.println("Started Test Custom");
        given().
                queryParam("name","Apurv").
                when().get("greeting").
                then().statusCode(200).and().body("id", equalTo("8"));
    }
}