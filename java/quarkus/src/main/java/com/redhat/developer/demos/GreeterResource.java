package com.redhat.developer.demos;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreeterResource {

  @Inject
  GreetingService greetingService;

  @Inject
  @ConfigProperty(name = "MESSAGE_PREFIX", defaultValue = "Hi")
  String messagePrefix;

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/")
  public String greet() {
    return greetingService.greet(messagePrefix);
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  @Path("/healthz")
  public String health() {
    return "OK";
  }
}
