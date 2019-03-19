public class ArrayStack <T> implements Stack<T> {
    private Object[] items;
    private int size;
    public ArrayStack(){
        items = new Object[10];

    }
    public void push(T item){
        if(items.length == size){
            Object[] temp = new Object[2*size];
            for(int i = 0; i < size; i++){
                temp[i] = items[i];
            }
            items = temp;
        }
        items[size] = item;
        size ++;
    }
    public T pop(){
        T item = (T)items[size-1];
        size --;
        return item;
    }
    public T peek(){
        return (T)items[size-1];
    }
    public boolean empty(){
        return size == 0;
    }
}
