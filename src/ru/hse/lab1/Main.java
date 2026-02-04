package ru.hse.lab1;

import ru.hse.lab1.second.Person;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Иван", 21);
        
        System.out.println("Возраст: " + p.age + "\nИмя: " + p.name);
    }
}