package ArrayListCustom;

/**
 * Created by arch on 7/12/17.
 */
public class LinkedL <T> implements LinkedL_I<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;
    private boolean wasInit = false;

    public LinkedL(T t){
        this.add(t);
        this.size++;
    }

    public void add(T t){
        if(! wasInit){
            this.head = new Node<T>(t);
            this.head.data = t;
            this.head.next = null;
            this.head.prev = null;
            this.wasInit = true;
        } else{

        }
    }

    public void remove(T t){

    }


    public int size(){
        return this.size;
    }

    private Node<T> find(T t){
        return null;
    }
}
