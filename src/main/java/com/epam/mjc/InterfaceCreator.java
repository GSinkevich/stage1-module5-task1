package com.epam.mjc;

import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
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
        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {
        throw new UnsupportedOperationException("You should implement this method.");
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        throw new UnsupportedOperationException("You should implement this method.");
    }
}
