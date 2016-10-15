package test;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/abc")
public class HelloWorldResource {
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello, world!";
    }
}
