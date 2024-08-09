public class StatickStack<T> implements Interface<T>{
    private int top = -1;
    private T[] data;

    public StatickStack(int size) {
        data = (T[]) new Object[size];
    }

    @Override
    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowError("Pilha cheia");
        }
        data[++top] = element;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new StackOverflowError("Pilha vazia");
        }
        return data[top--];
    }

    @Override
    public void clear() {
        top = -1;
    }

    @Override
    public boolean isFull() {
        return top == data.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
