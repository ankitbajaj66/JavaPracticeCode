package overloading;

import java.security.PublicKey;

public class ClassMethodOverloading {

    /*
    Compile time Error
    public void foo()
    {

    }
    public String foo()
    {

    }*/


//    public void foo(int a) {
//        System.out.println("int agrs");
//    }

    // Matches After Promotion
    public void foo(float a) {
        System.out.println("long agrs");
    }

    // Object args
    public void foo(Object o) {
        System.out.println("Object agrs");
    }

    // String args
    public void foo(String s) {
        System.out.println("String agrs");
    }


  /*  // String args
    public void foo(StringBuffer s) {
        System.out.println("StringBuffer agrs");
    }*/


}
