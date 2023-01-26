package me.namila.tutorials.springaop.app;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @author Namila Bandara
 * @date 26/01/2023
 */
@Component
public class HelloServiceImpl implements HelloService{

    @Override
    public Mono<String> sayHello(String name) {
        return Mono.defer(()->Mono.just(name)).map(n-> "Hello "+name);
    }
}
