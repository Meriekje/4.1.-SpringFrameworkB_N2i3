package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String salute(@RequestParam(name = "name", defaultValue = "UNKNOWN") String name) {
        return "Hello, " + name + ", you are running a Gradle project.";
    }

    @GetMapping("/HelloWorld2/{name}")
    public String salute2(@PathVariable(name = "name", required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hello, " + name + ", you are running a Gradle project.";
    }
}
