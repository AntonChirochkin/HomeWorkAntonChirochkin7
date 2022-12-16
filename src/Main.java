public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int savings = 15000;
        int totalMoney = 0;
        int m = 0;
        while (totalMoney <= 2_459_000) {
            totalMoney = totalMoney + savings;
            m = m + 1;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + totalMoney + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number = number + 1;
            System.out.print(number + " ");
        }
        System.out.println();
        for (int i = 11; i > 1; i--) {
            number = i - 1;
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = (12_000_000 / 1000) * 17;
        int mortality = (12_000_000 / 1000) * 8;
        int populationNext = birthRate - mortality;
        int year = 2022;
        while (year <= 2032) {
            population = population + populationNext;
            year = year + 1;

            System.out.println("Год " + year + ", численность населения составляет " + population + " миллионов человек.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        float cantribution = 15000;
        float persent = 7f;
        int mounth = 0;
        while (cantribution < 12_000_000) {
            cantribution += cantribution * (persent / 100);
            mounth = mounth + 1;

            System.out.println("Месяц " + mounth + " сумма накоплений " + cantribution + " рублей.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        float cantribution = 15000;
        float persent = 7f;
        int mounth = 0;
        while (cantribution < 12_000_000) {
            cantribution += cantribution * (persent / 100);
            mounth = mounth + 1;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " сумма накоплений " + cantribution + " рублей.");
            }
        }
    }


    public static void task6() {
        System.out.println("Задача 6");
        float cantribution = 15000;
        float persent = 7f;
        long mounth;
        int totalMounth = 9 * 12;
        while (mounth < totalMounth) {
            cantribution += cantribution * (persent / 100);
            mounth = mounth + 1;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + " сумма накоплений " + cantribution + " рублей.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 1;
        int mounth = 31;
        while (friday < mounth) {
            friday = friday + 1;
            if (friday % 7 == 2){
                System.out.println("Сегодня пятница " + friday + "-e число. Пора готовить отчет.");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int year1 = 2022;
        int year2 = 2022 + 100;
        int comet = 0;
        while (comet < year1 && comet < year2) {
            comet = comet + 79;
            if (comet > 1822 && comet < year2)
            System.out.println(comet);
        }
    }
}