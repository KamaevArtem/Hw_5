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
        } else if (clientOs == 1 && clientOs < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientOs >=2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        int year = 2021;
        int beginningLeapYear = 1584;
        int leapYear = 4;
        int itIsNotLeapYear = 100;
        int isLeapYear = 400;
        int quantityPastYear = year - beginningLeapYear;
        int isLeapYear400 = quantityPastYear % isLeapYear;
        int isNotLeapYear100 = isLeapYear400 % itIsNotLeapYear;
        int calculationLeapYear = quantityPastYear % leapYear;
        if (calculationLeapYear != 0) {
            System.out.println(year + " год не является високосным");
        } else if (calculationLeapYear == 0) {
            if (isLeapYear400 == 0) {
                System.out.println(year + " год является високосным");
            } else if (isLeapYear400 != 0) {
                if (isNotLeapYear100 == 0) {
                    System.out.println(year + " год не является високосным");
                } else if (isNotLeapYear100 !=0) {
                    System.out.println(year + " год является високосным");
                }
            }
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