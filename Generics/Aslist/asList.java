package Generics.Aslist;

import java.util.ArrayList;
import java.util.Arrays;

public class asList {
    public static void main(String[] args) {
        
    }
    public static<T> void asList(T[] array){
        ArrayList<T> list = new ArrayList<>(Arrays.asList(array));
    }
}
