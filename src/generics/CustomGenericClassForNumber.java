package generics;

public class CustomGenericClassForNumber<T extends Number> {

    T obj;

    T get() {
        return obj;
    }

    void add(T obj) {
        this.obj = obj;
    }
}
