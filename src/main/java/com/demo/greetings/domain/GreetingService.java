package com.demo.greetings.domain;

import com.demo.greetings.domain.models.CreateGreetingRequest;
import com.demo.greetings.domain.models.Greeting;
import java.util.Optional;

// import org.springframework.http.ResponseEntity;

public interface GreetingService {

    // record expects non name as form input,
    // insert auto increments id, auto generates uuid
    void createGreeting(CreateGreetingRequest request);

    // returns Greeting(id:null, username:String)
    Optional<Greeting> responseGreeting(String username);

    // stubbed for later
    // boolean updateGreeting(String name);
    // boolean deleteGreeting(String name);
}
