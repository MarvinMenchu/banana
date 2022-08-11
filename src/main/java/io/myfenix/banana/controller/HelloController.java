package io.myfenix.banana.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class HelloController {

    @GetMapping("/misionera")
    public Map<String, String> hello(){
        Map<String, String> datos = new HashMap<>();
        datos.put("misionera","Carolina");
        return datos;
    }
}
