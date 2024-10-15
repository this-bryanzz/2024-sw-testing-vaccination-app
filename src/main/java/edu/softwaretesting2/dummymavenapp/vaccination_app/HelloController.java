package edu.softwaretesting2.dummymavenapp.vaccination_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final HelloService service;
    @Autowired
    HelloController(HelloService service){
        this.service = service;
    }

    @GetMapping
    String sayHello(){
        return service.sayHello("ES") + "\n";
    }
}
