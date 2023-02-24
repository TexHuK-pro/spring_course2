package org.example.spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Dog implements Pet {
    //private String name;

/*    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/


    @PostConstruct
    public  void init(){
        System.out.println("init метод");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroy метод");
    }

    public Dog() {
        System.out.println("Бин собаки создан");
    }

    @Override
    public void say() {
        System.out.println("Гав-Гав");
    }
}
