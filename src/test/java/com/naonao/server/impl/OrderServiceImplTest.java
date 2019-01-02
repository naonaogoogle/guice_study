package com.naonao.server.impl;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.naonao.server.OrderService;
import org.junit.Before;
import org.junit.Test;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:37
 */
public class OrderServiceImplTest {

    @Inject
    private OrderService orderService;
    @Before
    public void setUp() {
        Guice.createInjector(new ServerModule())
                .injectMembers(this);
    }

    @Test
    public void sendToPayment() {
        orderService.sendToPayment(789L);

    }
}