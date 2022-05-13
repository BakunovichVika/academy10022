package by.academy.lesson19;

import java.util.Set;

public class Order {

    private String orderNo;
    private Set<OrderItem> orderItemSet;

    public Order(String orderNo, Set<OrderItem> orderItemSet) {
        this.orderNo = orderNo;
        this.orderItemSet = orderItemSet;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Set<OrderItem> getOrderItemSet() {
        return orderItemSet;
    }

    public void setOrderItemSet(Set<OrderItem> orderItemSet) {
        this.orderItemSet = orderItemSet;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", orderItemSet=" + orderItemSet +
                '}';
    }
}
