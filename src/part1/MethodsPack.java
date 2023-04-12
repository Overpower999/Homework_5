package part1;

public class MethodsPack {
    public void printThreeWords() {
        System.out.println("Apple" + "\n" + "Orange" + "\n" + "Banana");
    }

    public void checkSumSign() {
        int a = 3;
        int b = 7;
        if ((a + b) >= 0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    public void printColor() {
        int value = -45;
        if (value <= 0) {
            System.out.println("Червоний");
        } else if (value <= 100 && value > 0) {
            System.out.println("Жовтий");
        } else if (value > 100) {
            System.out.println("Зелений");

        }
    }

    public void compareNumbers() {
        int a = 5;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // Задача 6
    public boolean sumCompInt(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }

    }

    // Задача 7
    public void integerPlusMinus(int a) {
        if (a >= 0) {
            System.out.println("Додатнє число");
        } else if (a < 0) {
            System.out.println("Від’ємне число");
        }
    }

    // Задача 8
    public boolean integerPositivNegativ(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    // Задача 9

    public void stringCountPrint(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    // Задача 10

    public boolean yearStatus(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

}