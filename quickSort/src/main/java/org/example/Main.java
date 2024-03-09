package org.example;

import java.util.Comparator;

public class Main<T> implements Comparator<T> {
    public int compare(T case1, T case2) {
        if(case1 instanceof Integer && case2 instanceof Integer) {
            return Integer.compare((Integer)case1, (Integer)case2);
        } else if (case1 instanceof String && case2 instanceof String) {
            return ((String)case1).compareTo((String)case2);
        }
        return 0;
    }
}