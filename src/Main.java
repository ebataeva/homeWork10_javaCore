import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

static String[] WORDS =  {"привет", "кошка", "дом", "солнце", "пальто", "дверь", "дом", "привет", "заяц", "дом", "дом"};

    public static void main(String[] args) {
        System.out.printf(Arrays.toString(WORDS)); //вывод массива изначального
        HashSet<String> h = new HashSet<>();
        for (String a : WORDS) {
            h.add(a);
        }
        System.out.println(); //просто пустая строка, чтобы вывод был красивый
        System.out.println(h);//вывод массива без повторений;

        HashMap<String, String> mapWords = new HashMap<String, String>();
        for (int i = 0; i < WORDS.length ; i++) {
            int n = 0;
            for (int j = 0; j < WORDS.length; j++) {

                if(WORDS[i] == WORDS[j]){
n++;

                }
                mapWords.put("\n"+WORDS[i],"встречается "+n);

            }
        }

        System.out.println(mapWords);
    }


}
