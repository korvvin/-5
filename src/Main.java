public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1 и 2");
        boolean clientOS = false;
        short age = 2020;
        if (clientOS == true && age < 2015) {
            System.out.println("Установите упрощеную версию приложения для iOS по ссылке");
        } else if (clientOS == true && age >= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == false && age >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == false && age < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("задание 3");
        int year = 200;
        if(year%4==0&&year%100!=0||year%400==0) {
            System.out.println("год высокосный");
        }
        else {
            System.out.println("год не высокосный");
        }
        System.out.println("задание 4");
        int deliveryDistance = 95;
        int time = 1;
        if(deliveryDistance<=20){
            System.out.println("Потребуется дней: " + time);
        }
        else if(deliveryDistance>20&&deliveryDistance<+60){
            time+=1;
            System.out.println("Потребуется дней: " + time);
        }
        else if(deliveryDistance>60&&deliveryDistance<=100){
            time+=2;
            System.out.println("потребуется дней: "+time);
        }
        System.out.println("задание 5");
        int monthOfYearNumber = 5;

        switch (monthOfYearNumber) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("столько месяцев нет");
        }

    }
}