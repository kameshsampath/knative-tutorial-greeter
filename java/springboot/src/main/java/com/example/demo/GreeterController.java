package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreeterController
 */
@RestController
public class GreeterController {

    private static final String RESPONSE_STRING_FORMAT = "%s greeter => '%s' : %d\n";

    private static final String HOSTNAME =
            parseContainerIdFromHostname(System.getenv().getOrDefault("HOSTNAME", "unknown"));

    static String parseContainerIdFromHostname(String hostname) {
        return hostname.replaceAll("greeter-v\\d+-", "");
    }

    @Value("${MESSAGE_PREFIX:Hi}")
    private String prefix;

    /**
     * Counter to help us see the lifecycle
     */
    private int count = 0;

    @GetMapping("/")
    public String greet() {
        count++;
        return String.format(RESPONSE_STRING_FORMAT, prefix, HOSTNAME, count);
    }

    @GetMapping("/healthz")
    public String health() {
        return "OK";
    }
}
