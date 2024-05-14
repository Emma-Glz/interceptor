package com.vasscompany.springbootinterceptor.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class TimeController {

    @GetMapping("/foo")
    public Map<String, String> foo(){
        return Collections.singletonMap("message", "Msj desde el controlador de foo");
    }

    @GetMapping("/var")
    public Map<String, String> var(){
        return Collections.singletonMap("message", "Msj desde el controlador de var");
    }

    @GetMapping("/vaz")
    public Map<String, String> vaz(){
        return Collections.singletonMap("message", "Msj desde el controlador de vaz");
    }
}
