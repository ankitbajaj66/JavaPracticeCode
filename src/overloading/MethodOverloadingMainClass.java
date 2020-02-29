package overloading;

import oopsconceptsdemo.accessmodifier.ClassA;

public class MethodOverloadingMainClass {

    public static void main(String args[]) {

        ClassMethodOverloading classMethodOverloading = new ClassMethodOverloading();

        // If no method then then promote variable to up level
        classMethodOverloading.foo(2);

        // Child will get the prority
        // If two child then compile time issue
        classMethodOverloading.foo(null);
    }
}
