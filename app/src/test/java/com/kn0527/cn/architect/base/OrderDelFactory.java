package com.kn0527.cn.architect.base;

/**
 * auto：xkn on 2018/3/7 15:34
 */

public class OrderDelFactory {
    public void delOrder(IOrder order){
        int orderNumber = order.getOrderNumber();
        while (orderNumber>0){
            System.out.println("原始订单:" + order.hashCode());
            try {
                IOrder iOrder=(IOrder)order.cloneType();
                iOrder.setOrderNumber(orderNumber>=1000?1000:orderNumber);
                System.out.println("newOrder" + iOrder.hashCode() + " number:" + iOrder.getOrderNumber());
                orderNumber -= 1000;
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

    }
}
