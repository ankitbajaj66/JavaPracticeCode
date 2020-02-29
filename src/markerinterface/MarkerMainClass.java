package markerinterface;

import oopsconceptsdemo.accessmodifier.ClassA;

public class MarkerMainClass {

    public static void main(String args[]) {

        Employee emp = new Employee("Ankit Bajaj");
        Employee empCopy = null;
        try {
            empCopy = (Employee) emp.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Before Clone:" + emp.getName());
        System.out.println("After Clone:" + empCopy.getName());

        ClassB classB = new ClassB();
        System.out.println(classB.b);

    }
}
