public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Для установки приложения для iOS перейдите по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Для установки приложения для Android перейдите по ссылке");
        } else {
            System.out.println("Ваша операционная система не поддерживается приложением");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        int clientOs = 1;
        if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение для Android по ссылке");
        } else {
            System.out.println("Ваша операционная система не поддерживается.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2020;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 ==0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
}