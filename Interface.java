public interface Interface<T> {


    void push(T data);
    T pop();
    void clear();
    boolean isFull();
    boolean isEmpty();
}
