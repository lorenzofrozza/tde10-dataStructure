package Queue.ex01;

public class GenericQueue<T> {
    private T[] elements;
    private int size;

    public GenericQueue(int capacity) {
        this.elements = (T[]) new Object[capacity]; // Create a generic array
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
//        if( this.size == 0 ){
//            return true;
//        }
//        return false;
        return this.size == 0;
    }

    public boolean isFull(){
        return this.size == this.elements.length;
    }

    //Enfileirar
    public void push(T element){
        if(!isFull()){
            elements[size] = element;
            size++;
        } else {
            System.out.println("The stack is full");
        }
    }

    //Desenfileirar
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T element = (T) elements[0];
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        elements[--size] = null;
        return element;
    }

    //Espiar
    public T peek(int index){
        if(!isEmpty()){
            return this.elements[index];
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "[";

        for(int i = 0; i < size; i++){
            s += elements[i];
            if(i < size - 1){
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
