package com.deploy.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.mesagge}")
    String mesagge;

    @GetMapping("/hola")
    public String holamundo(){
        System.out.println(mesagge);
        return "hola mundo";
    }




}
