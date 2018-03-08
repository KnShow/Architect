package com.kn0527.cn.architect.base;

import org.junit.Test;

/**
 * auto：xkn on 2018/3/8 09:51
 */

public class Client {
    @Test
    public void test() {
        OrderDelFactory dealFactory = new OrderDelFactory();
        PersonalOrder xOrder = new PersonalOrder();
        xOrder.setOrderName("汽车玩具");
        xOrder.setOrderNumber(3200);
        dealFactory.delOrder(xOrder);


    }
}
