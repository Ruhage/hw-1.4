public class Main {
    public static void main(String[] args) {
        /// Задание 1
        System.out.println("Задание 1");
        int age = 24;
        if (age == 18 || age > 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        /// Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        /// Задание 3
        System.out.println("Задание 3");
        int capacity = 102;
        int seatPlace = 60;
        int standing = capacity - seatPlace; // стоячие места

        int seatsUsed = 60;
        int otherUsed = 42;
        if (seatsUsed < seatPlace) {
            System.out.println("Ещё есть " + (seatPlace - seatsUsed) + " сидячих мест");
        }
        if (otherUsed < standing) {
            System.out.println("Ещё есть " + (standing - otherUsed) + " стоячих мест");
        }
        if (standing == otherUsed) {
            System.out.println("Стоячих мест нет");
        }
        if (seatPlace == seatsUsed) {
            System.out.println("Сидячих мест нет");
        }
    }
}