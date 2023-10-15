package com.epam.mjc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {
        Predicate<List<String>> result = strings -> {
            for (String s:strings) {
                return Character.isUpperCase(s.charAt(0));
            }
            return true;
        };

        return  result;
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        List<Integer> myList = new ArrayList<>();
        return integers -> {
            for (var a :integers) {
                if (a%2 ==0){
                    myList.add(a);
                }
            }
            integers.addAll(myList);
        };

    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        List<String> myList = new ArrayList<>();
        return () -> {
            for (String a :values) {
                boolean FirstChar = Character.isUpperCase(a.charAt(0));
                boolean LastChar = '.' == a.charAt(a.length()-1);
                boolean stringSize = 2 < a.length() - a.replaceAll(" ", "").length();
                 if (FirstChar && LastChar && stringSize){
                     myList.add(a);
                 }
            }
            return myList;
        };

    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        Map<String,Integer> result = new HashMap<>();
        return listString -> {
            for (var currentString :listString) {
                result.put(currentString,currentString.length());
            }
            return  result;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        List<Integer> result = new ArrayList<>();
        return (x,a) -> {
            result.addAll(x);
            result.addAll(a);
            return  result;
        };
    }
}
