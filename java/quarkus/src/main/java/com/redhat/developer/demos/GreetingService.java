package com.redhat.developer.demos;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

  private static final String RESPONSE_STRING_FORMAT = "%s greeter => '%s' : %d\n";

  private static final String HOSTNAME =
    parseContainerIdFromHostname(System.getenv().getOrDefault("HOSTNAME", "unknown"));

  static String parseContainerIdFromHostname(String hostname) {
    return hostname.replaceAll("greeter-v\\d+-", "");
  }

  /**
   * Counter to help us see the lifecycle
   */
  private int count = 0;

  public String greet(String prefix) {
    count++;
    return String.format(RESPONSE_STRING_FORMAT, prefix, HOSTNAME, count);
  }

}
