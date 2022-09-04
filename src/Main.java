import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание урока 1.8. Методы");
        task1(LocalDate.now().getYear());
        task2(0, 2022);
        task3(95);
    }

    public static void task1(int year) {

        if (year % 4 == 0 && year % 100 !=0) {
            System.out.println(year + " - является високосным годом");
        }
        else if (year % 4 == 0 && year % 100 == 0 && year % 400== 0) {
            System.out.println(year + " - является високосным годом");
        }
        else {
            System.out.println(year + " - не является високосным");
        }
    }

    public static void task2(int clientOS, int clientDeviceYear) {
        //Задаем значение переменной, где 0 - iOS, 1 -Android
        //Значение до 2015 - облегченная версия

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void task3(int deliveryDistance) {
        int zeroDistance = 20;
        int stepOfDelivery = 40;
        int result;
        if (deliveryDistance < zeroDistance) {
            result = 1;
        } else {
            result = ((deliveryDistance - zeroDistance) / stepOfDelivery) + 2;
        }
        System.out.println("Потребуется дней для доставки: " + result);


    }
}