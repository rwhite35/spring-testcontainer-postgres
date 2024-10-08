package com.demo.greetings.clients.greeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

public interface GreetingsServiceClient {

    // GetExchange depends on request from CreateGreetingRequest.record
    @GetExchange("/api/greetings/{username}")
    GreetingName getUsername(@PathVariable String username);

    // on inital web page load
    // @GetExchange("/{username}")
    // GreetingName setUsername(@PathVariable String username);
}
