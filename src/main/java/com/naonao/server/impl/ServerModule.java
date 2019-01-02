package com.naonao.server.impl;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.naonao.server.OrderService;
import com.naonao.server.PaymentService;
import com.naonao.server.PriceService;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:31
 */
public class ServerModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(OrderService.class).to(OrderServiceImpl.class);
        bind(PaymentService.class).to(PaymentServiceImpl.class);
        bind(PriceService.class).to(PriceServiceImpl.class);
    }

    @Provides Long getSessionId() {
        return System.currentTimeMillis();
    }
}
