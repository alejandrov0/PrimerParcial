package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class ColaTest implements Cola {

    public LinkedList<String> cola;

    @Before
    public void init() {
        cola = new LinkedList<String>();
        cola.add("Bienvenidos");
        cola.add("a");
        cola.add("Programacion 3");
    }

    public void enqueue(String item) {
        cola.add(item);
    }

    public String deque() {
        return cola.remove();
    }

    public String peek() {
        return cola.peek();
    }

    public int size() {
        return cola.size();
    }

    public boolean isEmpty() {
        return cola.isEmpty();
    }

    @Test
    public void testPushCola(){
        enqueue("testPushPila");
        String cima = peek();
        assert(cima.equals("Bienvenidos"));
    }

    @Test
    public void testPopCola(){
        String cima1 = deque();
        String cima2 = peek();
        assert(cima1.equals("Bienvenidos"));
        assert(cima2.equals("a"));

    }

    @Test
    public void testSizeCola(){
        int t1 = size();
        deque();
        deque();
        int t2 = size();
        assert (t1==3);
        assert (t2==1);

    }
}
