package com.kn0527.cn.architect.base;

/**
 * auto：xkn on 2018/3/7 15:37
 */

public class PersonalOrder implements IOrder {


    private int orderNum;
    private String orderName;

    public PersonalOrder(){}
    public PersonalOrder(PersonalOrder order) {
        setOrderName(order.orderName);
        setOrderNumber(order.orderNum);
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public int getOrderNumber() {
        return orderNum;
    }

    @Override
    public void setOrderNumber(int orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public Object cloneType() throws CloneNotSupportedException {
        return clone();
    }

    @Override
    protected Object clone(){
        return new PersonalOrder(this);
    }
}
