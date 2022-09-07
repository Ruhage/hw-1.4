public class Main {
    public static void main(String[] args) {

        /// Задание 1
        System.out.println("Задание 1");
        int age = 14;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
        }

        /// Задание 2
        System.out.println("Задание 2");
        if (age <5) {
            System.out.println("Ребёнок не может кататься на аттракционе");
        }
        else if (age <14) {
            System.out.println("То он может кататься только в сопровождении взрослого");
        }
        else {
            System.out.println("Ребёнок может кататься без сопровождения взрослого");
        }

        /// Задание 3
        System.out.println("Задание 3");
        int one = 7;
        int two = 6;
        int free = 5;
        if (one > two) {
            if (one >= free) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + free);
            }
        } else if (two > one) {
            if (two >= free) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + free);
            }
        } else {
            if (one > free) {
                System.out.println("Максимальное число - " + one);
            } else if (free > one) {
                System.out.println("Максимальное число - " + free);
            } else {
                System.out.println("Все три числа равны");
            }
        }
    }
}