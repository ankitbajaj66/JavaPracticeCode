package comparatorinterface.sortingonpojoobject;

import java.util.Objects;

public class Customer implements Comparable<Customer> {

    private String name;
    private int empId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return empId == customer.empId &&
                Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId);
    }

    public Customer(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int compareTo(Customer customer) {
        if (this.empId > customer.empId) {
            return 1;
        } else if (this.empId < customer.empId) {
            return -1;
        }
        return 0;
    }
}
