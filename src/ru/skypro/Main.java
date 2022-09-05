package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 1));
        List<Integer> oddNums1 = new ArrayList<>();
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) % 2 != 0) {
                oddNums1.add(nums1.get(i));
            }
        }
        System.out.println("Нечетные числа: ");
        System.out.println(oddNums1);
        System.out.println();

        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 10, 8, 3, 4, 4, 5, 5, 6, 7, 2, 10));
        List<Integer> evenNums2 = new ArrayList<>();
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 == 0) {
                if (!evenNums2.contains(nums2.get(i))) {
                    evenNums2.add(nums2.get(i));
                }
            }
        }
        Collections.sort(evenNums2);
        System.out.println("Четные числа: ");
        System.out.println(evenNums2);
        System.out.println();


        List<String> words = new ArrayList<>(List.of("air", "animal", "bottom", "day", "air", "children", "animal", "day"));
        System.out.println("Исходный список слов: ");
        System.out.println(words);

        List<String> uniqueWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            if (!uniqueWords.contains(words.get(i))) {
                uniqueWords.add((words.get(i)));
            }
        }
        System.out.println("Список слов без повторний:");
        System.out.println(uniqueWords);
        System.out.println();

        HashSet<String> uniqueWords2 = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            uniqueWords2.add(words.get(i));
        }
        System.out.println("второй вариант: ");
        System.out.println(uniqueWords2);
        System.out.println();


        System.out.println("Количество поторений слов: " + (words.size() - uniqueWords.size()));

    }
}
