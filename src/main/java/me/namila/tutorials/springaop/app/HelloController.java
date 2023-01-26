package me.namila.tutorials.springaop.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author Namila Bandara
 * @date 26/01/2023
 */

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;
    @GetMapping("hello/{name}")
    public Mono<String> sayHello(@PathVariable String name) {
        return helloService.sayHello(name).map(s-> ResponseEntity.ok(s).toString());
    }
}
