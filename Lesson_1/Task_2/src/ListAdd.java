package Lesson_1.Task_2.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListAdd {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Porsche");
        list.add("Renault");
        list.add("Toyota");
        list.add("Land Rover");
        list.add("Mazda");
        list.add("Chevrolet");
        list.add("ZAZ");
        list.add("Citroen");
        list.add("Audi");
        Collections.sort(list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            System.out.println(temp);
        }

    }
}