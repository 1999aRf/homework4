public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1");
        int year = 18;
        int secYear = 17;
        if (year >= 18) {
            System.out.println("Если возраст человека равен " + year + ", то он совершеннолетний");
        }
        if (secYear < 18) {
            System.out.println("Если возраст человека равен " + secYear + ", то он несовершеннолетний");
        }


        System.out.println("Задание 2");
        int temperature1 = 1;
        int temperature2 = 8;
        if (temperature1 < 5) {
            System.out.println("На улице " + temperature1 + " градус, нужно надеть шапку");
        }
        if (temperature2 > 5) {
            System.out.println("На улице " + temperature2 + " градусов, можно идти без шапки");
        }


        System.out.println("Задание 3");
        int speed1 = 90;
        int speed2 = 50;
        if (speed1 > 60) {
            System.out.println("Если скорость " + speed1 + ", то придется заплатить штраф");
        }
        if (speed2 < 60) {
            System.out.println("Если скорость " + speed2 + ", то можно ездить спокойно");
        }


        System.out.println("Задание 4");
        int person1 = 3;
        int person2 = 11;
        int person3 = 24;
        int person4 = 35;
        if (person1 >= 2 && person1 <= 6) {
            System.out.println("Если возраст человека равен " + person1 + ", то ему нужно ходить в детский сад");
        }
        if (person2 >= 7 && person2 <= 17) {
            System.out.println("Если возраст человека равен " + person2 + ", то ему нужно ходить в школу");
        }
        if (person3 >= 18 && person3 <= 24) {
            System.out.println("Если возраст человека равен " + person3 + ", то ему нужно ходить в университет");
        }
        if (person4 >= 24) {
            System.out.println("Если возраст человека равен " + person4 + ", то ему нужно ходить на работу");
        }


        System.out.println("Задание 5");
        int child1 = 3;
        int child2 = 9;
        int child3 = 17;
        if (child1 < 5) {
            System.out.println("Если возраст ребенка равен " + child1 + ", то ему нельзя кататься на аттракционе");
        }
        if (child2 >= 5 && child2 < 14) {
            System.out.println("Если возраст ребенка равен " + child2 + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (child3 >= 14) {
            System.out.println("Если возраст ребенка равен " + child3 + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }


        System.out.println("Задание 6!");
        int seating = 60;
        int general = 102;
        int standing = general - seating;
        int passengerNumber = 102;
        if (passengerNumber < general) {
            if (passengerNumber < seating) {
                System.out.println("Есть свободные сидячие места");
            } else System.out.println("Сидячие места закончились. Остались только стоячие места");
        } else System.out.println("Вагон полностью забит");


        System.out.println("Задание 7!");
        int one = 1;
        int two = 4;
        int three = 3;
        if (one > two) {
            if (one > three) {
                System.out.println("Число " + one + " самое большое из трех чисел");
            } else {
                System.out.println("Число " + three + " самое большое из трех чисел");
            }
        }
            else {
            if (two > three) {
                System.out.println("Число " + two + " самое большое из трех чисел");
            } else System.out.println("Число " + three + " самое большое из трех чисел");
            }
    }
}
// По причине того что сначала сделал не как Pull request, а теперь делаю пуш чтобы была ссылка на Pull request