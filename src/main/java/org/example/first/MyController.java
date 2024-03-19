package org.example.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController {

    private final MyProperties myProperties;

    MyController(MyProperties myProperties) {
        this.myProperties = myProperties;
    }


    @GetMapping("/password")
    String password() {
        return myProperties.password();
    }



}
