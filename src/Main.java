public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        int  clientDeviceYear = 2015;
        if (clientOs == 0 &&  clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 95;
        int parametersDeliveryDistanceOneDay = 20;
        int parametersDeliveryDistanceTwoDay = 60;
        int parametersDeliveryDistanceThreeDay = 100;
        int parametersNotdeliveryDistance = 101;
        int deliveryOneDay = 1;
        int deliveryTwoDay = 2;
        int deliveryThreeDay = 3;
        boolean distanceDeliveryOneDay = deliveryDistance < parametersDeliveryDistanceOneDay;
        boolean distanceDeliveryTwoDay = deliveryDistance >= parametersDeliveryDistanceOneDay && deliveryDistance < parametersDeliveryDistanceTwoDay;
        boolean distanceDeliveryThreeDay = deliveryDistance >=parametersDeliveryDistanceTwoDay && deliveryDistance <= parametersDeliveryDistanceThreeDay;
        boolean distanceNotdelivery = deliveryDistance > parametersNotdeliveryDistance;
        if (distanceDeliveryOneDay){
            System.out.println("Потребуется дней " + deliveryOneDay);
        } else if (distanceDeliveryTwoDay) {
            System.out.println("Потребуется дней " + deliveryTwoDay);
        } else if (distanceDeliveryThreeDay) {
            System.out.println("Потребуется дней " + deliveryThreeDay);
        } else if (distanceNotdelivery) {
            System.out.println("К вам нет доставки");
        }
        //Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц зимний");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц весенний");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц летний");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц осенний");
                break;
            default:
                System.out.println("Такого месяца нет");
        }

    }
}