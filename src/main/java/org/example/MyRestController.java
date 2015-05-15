package org.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
This rest controller is correctly detected by swagger.
If I go to http://localhost:8080/swagger-ui.html I can see my-rest-controller
 */
@RestController
public class MyRestController {

    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    public String foo() {
        return "bar";
    }
}
