package comparatorinterface.sortingonpojoobject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SotingOnPojoMainClass {


    public static void main(String args[]) {

        Customer customer1 = new Customer("Ankit", 554677);
        Customer customer2 = new Customer("Ajay", 100458);
        Customer customer3 = new Customer("Suraj", 1288146);
        Customer customer4 = new Customer("Amit", 112258);
        Customer customer5 = new Customer("Swagat", 999999);
        Customer customer6 = new Customer("Umesh", 100000);

        List<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);
        listCustomer.add(customer4);
        listCustomer.add(customer5);
        listCustomer.add(customer6);

        System.out.println("Before Sorting");
        listCustomer.forEach(customer -> System.out.println("Customer empID: " + customer.getEmpId()));

        System.out.println();
        Collections.sort(listCustomer);
        System.out.println("After Sorting");
        listCustomer.forEach(customer -> System.out.println("Customer empID: " + customer.getEmpId()));

        // Above Sorting defines natual sorting written by class developer.
        // Now if we want to override this behavior we can sort using Comparator

        Comparator<Customer> comparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                if (o1.getEmpId() > o2.getEmpId()) {
                    return -1;
                } else if (o1.getEmpId() < o2.getEmpId()) {
                    return 1;
                }
                return 0;
            }
        };

        System.out.println();
        listCustomer.sort(comparator);
        System.out.println("After Sorting with custom comparator");
        listCustomer.forEach(customer -> System.out.println("Customer empID: " + customer.getEmpId()));

    }
}
