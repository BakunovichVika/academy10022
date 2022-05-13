package by.academy.lesson19;

import java.util.ArrayList;
import java.util.Set;

public class PrivilegedCustomer extends Customer {
    private int privilegeAccountNo;

    public PrivilegedCustomer() {
        super();
    }

    public PrivilegedCustomer(String name, Set<Address> addresses, ArrayList<Order> orders, int privilegeAccountNo) {
        super(name, addresses, orders);
        this.privilegeAccountNo = privilegeAccountNo;
    }

    public PrivilegedCustomer(int privilegeAccountNo) {
        this.privilegeAccountNo = privilegeAccountNo;
    }

    public int getPrivilegeAccountNo() {
        return privilegeAccountNo;
    }

    public void setPrivilegeAccountNo(int privilegeAccountNo) {
        this.privilegeAccountNo = privilegeAccountNo;
    }

    @Override
    public String toString() {
        return "PrivilegedCustomer{" +
                "privilegeAccountNo=" + privilegeAccountNo +
                '}';
    }
}
