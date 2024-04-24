import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        // можно было бы создать два класса на Integer и на String и передовать через конструктор параметны, но не знаю есть ли смысл?
    }
    public static void task1(){
        System.out.println("Задание 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num); // вместо печати, можно удалять элемены, которые являются четными и потом вывести nuns
            }
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        HashSet<Integer> hashSet = new HashSet<>(List.of(1, 1, 6, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums = new ArrayList<>(hashSet);
        for (Integer num : nums) {
            if (num % 2 == 0) {
                System.out.println(num); // вместо печати, можно удалять элемены, которые являются нечетными и потом вывести nuns
            }
        }
    }
    public static void task3(){
        System.out.println("Задание 3");
        List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        int total = 0;
        for (int i = 0; i < words.size(); i++) {
            for (int j = 0; j < words.size(); j++) {
                if (words.get(i).equals(words.get(j))){
                    total++;
                }
            }
            if (total == 1){
                System.out.println(words.get(i)); // возможно ли обойтись без второго цикла?
            }
            total = 0;
        }
    }
    public static void task4(){
        System.out.println("Задание 4");
        List<String> words = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        List<String> newWords = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < words.size(); i++) {
            for (String word : words) {
                if (words.get(i).equals(word)) { // возможно ли обойтись без второго цикла?
                    total++;
                }
            }
            if (!newWords.contains(words.get(i))){
                newWords.add(words.get(i));
                System.out.println(total);
            }
            total = 0;


        }

    }

}