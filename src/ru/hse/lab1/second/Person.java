package ru.hse.lab1.second;

/**
 *
 * @author Заика_Юлия
 * @version 1.0
 * @since 2026
 */
public class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

