package org.example.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Бин кошки создан");
    }

    @Override
    public void say() {
        System.out.println("Мур-Мур");
    }
}
