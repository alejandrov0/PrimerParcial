package org.example;

import java.nio.charset.CoderMalfunctionError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DinamicStructuresManager<T> {

    List<T> values = new ArrayList<>();

    public DinamicStructuresManager(List<T> values) {
        this.values = values;
    }

    public List<T> ordenar(){
        Collections.sort(values, new Main<>()); //
        return values;
    }

    public List<T> ordenarInversa(){
        Collections.sort(values, new Main<>()); //
        Collections.reverse(values); //
        return values;
    }

}
