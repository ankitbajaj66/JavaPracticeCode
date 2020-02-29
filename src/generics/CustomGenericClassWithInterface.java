package generics;

public class CustomGenericClassWithInterface<T extends TestInterface> {

    T obj;

    T get() {
        return obj;
    }

    void add(T obj) {
        this.obj = obj;
    }
}
