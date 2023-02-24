package org.example.spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    //@Autowired
    //@Qualifier("catBean")
    private Pet pet;
    //@Value("${person.surname}")
    private String surname;
    //@Value("${person.age}")
    private int age;



    @Autowired
    public Person(@Qualifier("catBean") Pet pet) {
        System.out.println("Бин Персоны создан");
        this.pet = pet;
    }

    public Person() {
        System.out.println("Бин Персоны создан без параметра");
    }


/*    @Autowired
    @Qualifier("dog")
    public void setPet(Pet pet) {
        System.out.println("В класс Персоны мы добавили питомца - setPet");
        this.pet = pet;
    }*/




    public void callYourPet(){
        System.out.println("Привет, мой любимый питомец!");
        pet.say();
    }

    public String getSurname() {
        System.out.println("Узнаем фамилию");
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Фамилия персоны добавлена");
        this.surname = surname;
    }

    public int getAge() {
        System.out.println("Узнаем возраст");
        return age;
    }

    public void setAge(int age) {
        System.out.println("Возраст персоны добавлен");
        this.age = age;
    }
}
