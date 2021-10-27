package com.example.jwtphaipanda;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuctionController {

    @GetMapping("/")
    public String index()
    {
        return "Welcome to our auction";
    }
}
