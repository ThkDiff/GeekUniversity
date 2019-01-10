package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        task1();
        PhoneDictionary ph = new PhoneDictionary();
        try {

            ph.add("Dan", "89107187421");
            ph.add("Dan", "89107115111");
            ph.add("Alex", "89156563782");
            ph.add("Jon", "99639089908");
            ph.add("lll", "89107187421");
        }catch (NumberException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(ph.getMap2());
        System.out.println(ph.get("Dan"));
    }
    public static void task1(){
        String[] words = {"Alex","Sonya","Alex",
        "Tamerlan","Dan","Bob","Veronica",
        "Dan", "Vladimir", "Rebecca", "Michail",
        "Vladimir", "Sonya"};

        Map<String, Integer> map = new HashMap<>();

        for (String word : words)
            map.put(word, map.getOrDefault(word, 0) + 1);
        System.out.println(map);
    }
}
