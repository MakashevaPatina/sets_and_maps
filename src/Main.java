import java.util.*;
import java.util.function.Consumer;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of(
            "apple", "banana", "apple", "orange", "grape",
            "banana", "kiwi", "apple", "mango", "kiwi",
            "orange", "grape", "pear", "apple", "banana",
            "mango", "kiwi", "pear", "grape", "orange"
    ));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

    public static void main(String[] args) {
        System.out.println("Sets and maps");
        Set<Integer> numsSet = Set.copyOf(nums);
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("\ntask1\n");
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        System.out.println("\ntask2\n");
        Collections.sort(nums);
        int per = 1;
        for (Integer num : nums) {
            if (num %2 == 0 && num != per) {
                System.out.println(num);
                per = num;
            }
        }
    }
    public static void task3() {
        System.out.println("\ntask3\n");
        Set<String> wordsSet = new HashSet<>(words);
        System.out.println("wordsSet = " + wordsSet);
    }

    public static void task4() {
        System.out.println("\ntask4\n");
        Map<String, Integer> wordMap = new HashMap<>();
        for (String string: strings) {
            if (wordMap.containsKey(string)) {
                wordMap.put(string, wordMap.get(string) + 1);
            } else {
                wordMap.put(string, 1);
            }
        }
        for (int count: wordMap.values()) {
            System.out.println(count);
        }
    }

}
