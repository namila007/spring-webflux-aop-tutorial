package me.namila.tutorials.springaop.app;

import reactor.core.publisher.Mono;

/**
 * @author Namila Bandara
 * @date 26/01/2023
 */
public interface HelloService {

    public Mono<String> sayHello(String name);
}
