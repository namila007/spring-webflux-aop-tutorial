package me.namila.tutorials.springaop.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Namila Bandara
 * @date 26/01/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    String name;
    Contact contact;
}

class Contact {
    String email;
    String telephone;
}
