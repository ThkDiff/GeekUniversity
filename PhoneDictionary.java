package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDictionary {
    private Map<String, List<String>> map2 = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String name, String phonenumber) throws NumberException{
        if (map2.containsValue(phonenumber))
            throw new NumberException("This number already exist.");

        if (map2.containsKey(name)){
            phone_number_list.add(phonenumber);
            map2.put(name,phone_number_list);
        }
        else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phonenumber);
            map2.put(name,phone_number_list);
        }
    }

    public Map<String, List<String>> getMap2() {
        return map2;
    }

    public List<String> get(String name){
        return map2.get(name);
    }
}
