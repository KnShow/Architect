package com.kn0527.cn.architect.base;

/**
 * auto：xkn on 2018/3/7 15:30
 */

public interface IOrder extends Cloneable{
    int getOrderNumber();

    void setOrderNumber(int orderNum);
    Object cloneType() throws CloneNotSupportedException;
}
