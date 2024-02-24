public class Main {
    public static void main(String[] args) {
        // Задание 1

        int clientOS = 1;
        if ( clientOS == 0 ) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if ( clientOS == 1 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2

        int clientDeviceYear = 2015;
        int clientOs = 0;
        if ( clientOs == 1 && clientDeviceYear < 2015 ) {
            System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
        }
        else if ( clientOs == 1 && clientDeviceYear >= 2015 ) {
            System.out.println(" Устанвоите версию приложения для Android по ссылке ");
        }
        if ( clientOs == 0 && clientDeviceYear < 2015 ) {
            System.out.println(" Установите облегченнную версию приложения для IOS по ссылке");
        } else if ( clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println(" Установите версию приложения для IOS по ссылке");
        }

        // Задание 3

        int year = 400;
        if ( year > 1584 && ( year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 && year > 1584) {
            System.out.println(" Год является високосным !");}
        else System.out.println(" Год не является високосным !");

        // Задание 4

        int deliveryDistance = 95;
        if ( deliveryDistance < 20 && deliveryDistance >= 0) {
            System.out.println("Доставка займет сутки");}
        else if ( deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет двое суток");}
        else if ( deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет трое суток");}
        else System.out.println("доставка не доступна");

        // Задание 5

        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println(" Зима ");
                break;
            case 2:
                System.out.println(" Зима ");
                break;
            case 3:
                System.out.println(" Весна ");
                break;
            case 4:
                System.out.println(" Весна ");
                break;
            case 5:
                System.out.println(" Весна ");
                break;
            case 6:
                System.out.println(" Лето ");
                break;
            case 7:
                System.out.println(" Лето ");
                break;
            case 8:
                System.out.println(" Лето ");
                break;
            case 9:
                System.out.println(" Осень ");
                break;
            case 10:
                System.out.println(" ОСень ");
                break;
            case 11:
                System.out.println(" Осень ");
                break;
            case 12:
                System.out.println(" Зима ");
                break;
            default:
                System.out.println(" Такого месяца не существует ");

        }
        }


        }










