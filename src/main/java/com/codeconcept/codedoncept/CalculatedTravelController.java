package com.codeconcept.codedoncept;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

@RestController
@RequestMapping("travels-rest")
public class CalculatedTravelController {
   @GetMapping(value = "/{id}", produces = "application/json")
    public Duration timeWalk(){
       Duration duration = Duration.ofDays(5);
       return duration;
   }
}
