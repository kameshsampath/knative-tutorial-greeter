package com.redhat.developer.demos;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.startsWith;

@QuarkusTest
public class GreetingDefaultPrefixTest {
  
  @AfterAll
  public static void afterClass() {
    System.clearProperty("MESSAGE_PREFIX");
  }

  @BeforeAll
  public static void beforeClass() {
    System.clearProperty("MESSAGE_PREFIX");
  }
  
  @Test
  public void greet(){
      given()
        .when().get("/")
        .then()
        .statusCode(200)
        .body(startsWith("Hi"));
  }
}
