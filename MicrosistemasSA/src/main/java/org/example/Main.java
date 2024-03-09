package org.example;

public abstract class Main {

    public Node head;
    public Node tail;
    public int size;
    private Cola cola;

    public Main(Cola cola) {
        this.cola = cola;
    }

    public String ingresarPC(String placa){
        Node newNode = new Node(placa);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return newNode.value;
    }

    public String ProximaPC(){
        if (head == null) {
            return null;
        }
        return head.value;
    }

    public String entregarPC(){
        if (head == null) {
            return null;
        }

        String PC = head.value;
        head = head.next;
        size--;

        return PC;
    }

    public int obtenerPCEnCola(){
        return size;
    }

    public Object proximaPC() {
        return null;
    }

    public abstract void enqueue(String item);

    public abstract String deque();

    public abstract String peek();

    public abstract int size();

    public abstract boolean isEmpty();
}

