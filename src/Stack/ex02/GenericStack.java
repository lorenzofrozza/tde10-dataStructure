package Stack.ex02;

public class GenericStack<T> {
    private T[] elements;
    private int size;
    private final int maxSize =  100;


    public GenericStack() {
        this.elements = (T[]) new Object[maxSize]; // Create a generic array
        this.size = 0;
    }

    public int getSize() {
        return size;
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

    //Empilhar
    public void push(T element){
        if(!isFull()){
            elements[size] = element;
            size++;
        } else {
            System.out.println("The stack is full");
        }
    }

    //Desempilhar
    public T pop(){
        if(!isEmpty()){
            T removedElement = elements[size-1];
            size--;
            this.elements[size] = null; //Cleaning the memory
            return removedElement;
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
