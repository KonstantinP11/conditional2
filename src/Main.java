public class Main {
    public static void main(String[] args) {
//Задача 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Тип операционной системы не определен");
        }
//Задача 2
        System.out.println("Задача 2");
//        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Тип операционной системы не определен");
        }
//Задача 3
        System.out.println("Задача 3");
        int year = 2000;
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


//Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 90;
        int deliveryDays = 1;
        var answer = "Потребуется дней: ";
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays += 2;
        }
        answer = answer + deliveryDays;
        if (deliveryDistance > 100) {
            answer = "доставки нет";
        }
        System.out.println(answer);

//Задача 5
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }

}
// push