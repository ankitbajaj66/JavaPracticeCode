package functionalinterface;

public class FunctionalInterfaceMainClass {

    public static void main(String args[]) {

        IFunctionalInterface iFunctionalInterface = new IFunctionalInterface() {
            @Override
            public void print() {
                System.out.println("Learning Functional Interface as annonymous class");
            }
        };

        IFunctionalInterface iFunctionalInterface1 = () -> System.out.println("Learning Functional Interface as Lamda expression");
        iFunctionalInterface.print();
        iFunctionalInterface1.print();
    }
}
