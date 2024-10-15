package edu.softwaretesting2.dummymavenapp.vaccination_app;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello(String language){
        return language.equals("ES") ? "¡Hola Mundo!" : "Hello World!";
    }
}
