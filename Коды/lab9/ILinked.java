

public interface ILinked<E>{
    void addLast(E e);
    void addFirst(E e);
    int size();
    E getElementByIndex(int index);
    void removeByIndex(int index);
    void clean();
}
