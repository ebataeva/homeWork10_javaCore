import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {
        String[] words = {"привет", "кошка", "дом", "солнце", "пальто", "дверь", "дом", "привет", "заяц", "дом", "дом"};

        System.out.printf(Arrays.toString(words)); //вывод массива изначального
        printArrayWithoutDuplicates(words);
        findDuplicatesOfArray(words);
        PhoneBook book = new PhoneBook();
        book.add("Вася", "8943583");
        book.add("Вася", "89437583");
        System.out.println(book);
        book.get("Вася");
        System.out.println(book.get("Вася"));
    }

    public static void printArrayWithoutDuplicates(String[] words) {
        HashSet<String> h = new HashSet<>();
        for (String a : words) {
            h.add(a);
        }
        System.out.println(); //просто пустая строка, чтобы вывод был красивый
        System.out.println(h);//вывод массива без повторений;
    }

    public static void findDuplicatesOfArray(String[] words) {
        HashMap<String, String> mapWords = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            int n = 0;
            for (int j = 0; j < words.length; j++) {

                if (words[i] == words[j]) {
                    n++;

                }
                mapWords.put("\n" + words[i], "встречается " + n);

            }
        }

        System.out.println(mapWords);
    }


}
