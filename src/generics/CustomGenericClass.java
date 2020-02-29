package generics;

public class CustomGenericClass<T> {

    T obj;

    T get() {
        return obj;
    }

    void set(T obj) {
        this.obj = obj;
    }
}
