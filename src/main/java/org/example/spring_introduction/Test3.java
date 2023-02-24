package org.example.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = new Cat();
        //Pet pet = context.getBean("myPet", Pet.class);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname() + " " + person.getAge());

        context.close();
    }
}
