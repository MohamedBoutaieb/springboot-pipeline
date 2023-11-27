package com.mycompany.myapp.web.rest;


import io.swagger.v3.core.util.Json;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class HelloController {


    @GetMapping("hello")
    ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello world !", HttpStatus.OK);
    }
}
