public class Main {
    public static void main(String[] args) {
        task1();
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
}