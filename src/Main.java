public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Задача 1 конец");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
        System.out.println("Задача 2 конец");
        for (int i = 0; i <= 17; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
        System.out.println("Задача 3 конец");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 4 конец");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Задача 5 конец");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println("Задача 6 конец");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println("Задача 7 конец");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++)
            total = total + salary;
        {
            System.out.println(total);
        }
        System.out.println("Задача 8 конец");
        int salaryTwo = 29000;
        int totalTwo = 0;
        for (int i = 0; i <= 12; i++) {
            totalTwo = totalTwo + totalTwo / 100 * 12;
            totalTwo = totalTwo + salaryTwo;

            System.out.println("Месяц " + i + " Итого " + totalTwo);
        }
        System.out.println("Задача 9 конец");
        for (int i = 1; i <= 10; i++) {
            int b = i * 2;
            System.out.println("2 * " + i + " = " + b);
        }
        System.out.println("Задача 10 конец");
    }
}