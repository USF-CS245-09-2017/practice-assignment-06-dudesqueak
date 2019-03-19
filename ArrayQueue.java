public class ArrayQueue <T> implements Queue<T> {
    private Object[] items;
    private int head;
    private int tail;
    public ArrayQueue(){
        items = new Object[10];

    }
    public T dequeue(){
        T item = (T) items[head];
        head++;
        if(head == items.length){
            head = 0;
        }
        return item;
    }
    public void enqueue(T item){
        items[tail] = item;
        tail++;
        if(tail == items.length){
            tail = 0;
        }
        if(tail==head){
            Object[] temp = new Object[items.length*2];
            for(int i = 0; i< items.length; i++){
                temp [i] = items[(i+head)%(items.length)];
            }
            tail = items.length;
            head = 0;
            items = temp;
        }
    }
    public boolean empty(){
        return tail == head;
    }
}
