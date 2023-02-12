public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
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

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 30;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка до клиента занимает 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка до клиента занимает 2 дня");
        } else if (deliveryDistance <=100) {
            System.out.println("Доставка до клиента занимает 3 дня");
        } else {
            System.out.println("Нет доставки");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 11;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Пока других месяцев не придумали");

        }

    }
}