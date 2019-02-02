package Generics.Sorts;

import java.util.Arrays;

public class Task1{

    public static void main(String[] args) {
        Integer[] array = {10,2,7,-1,9,-100};
        changeArrayElements(array);
        System.out.println(Arrays.toString(array));
    }

    public static <T extends Integer> void changeArrayElements(T[] array){
        boolean flag = true;
        MyNumber mn = new MyNumber();
        int step = array.length;
        while (flag || step > 1){
            if (step > 1) {
                step = (int) (step / 1.24733095);
            }
            flag = false;
            int i = 0;
            while (i + step < array.length){
                if (mn.check(array[i],array[step + i])) {
                    T additionalVeriable = array[step + i];
                    array[step + i] = array[i];
                    array[i] = additionalVeriable;
                    flag = true;
                }
                i++;
            }
        }
    }
}

abstract class GenericClass<E extends Number> {
    public abstract boolean check(E x, E y);
}

class MyNumber extends GenericClass<Integer>{
    @Override
    public boolean check(Integer x, Integer y) {
        return x > y;
    }
}

