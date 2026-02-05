package ru.hse.lab1;

import ru.hse.lab1.second.Person;
/**
 * Главный класс запуска программы.
 *
 * @author Заика_Юлия
 * @version 1.0
 * @since 2026
 */

public class Main {
        /**
     * Конструктор класса Main.
     */
    public Main() {
    }

        /**
     * Точка входа в программу.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Person p = new Person("Иван", 21);
        
        System.out.println("Возраст: " + p.age + "\nИмя: " + p.name);
    }
}