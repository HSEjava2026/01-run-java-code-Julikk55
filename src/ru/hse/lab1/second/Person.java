package ru.hse.lab1.second;

/**
 * Класс Person хранит данные о человеке: имя и возраст.
 *
 * @author Заика_Юлия
 * @version 1.0
 * @since 2026
 */
public class Person {
    private String name;
    private int age;

    /**
     * Создаёт объект человека.
     *
     * @param name имя человека
     * @param age  возраст человека
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Печатает информацию о человеке в консоль.
     */
    public void printInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}

