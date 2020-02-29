package generics;

import java.util.ArrayList;
import java.util.List;

public class GenricsMainClass {

    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        list.add("Ankit");
        list.add("Ajay");
        list.add("Rohan");

        String name = list.get(0);
        System.out.println(name);

        CustomGenericClass<String> customGenericClass = new CustomGenericClass<>();
        customGenericClass.set("Ajay");
        System.out.println(customGenericClass.get());

        CustomGenericClassForNumber<Number> customGenericClassForNumber = new CustomGenericClassForNumber<>();
//        customGenericClassForNumber.add(Byte.decode(""));

        CustomGenericClassWithInterface<TestInterface> customGenericClassWithInterface = new CustomGenericClassWithInterface<>();
        customGenericClassWithInterface.add(new TestInterface() {
            @Override
            public void print() {

            }
        });

        customGenericClassWithInterface.add(new TestInterfaceImpl());

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.dataTypeCheck(list);

        List<String> list1 = new ArrayList<>();
        list.add("");
        List<Integer> list2 = new ArrayList<>();
        List<Float> list3 = new ArrayList<>();
        List<Boolean> list4 = new ArrayList<>();
        genericMethod.dataTypeCheck(list1);
//        genericMethod.dataTypeCheck(list2);
//        genericMethod.dataTypeCheck(list3);
//        genericMethod.dataTypeCheck(list4);

//        List<? extends Number> list5 = new ArrayList<Number>();



    }

}
