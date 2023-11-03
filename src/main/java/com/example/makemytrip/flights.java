package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights{
    @GetMapping("/flights")
    public String getData() {return "book your urgent flights from nagpur to pune with 10% of discount" ;}
}



