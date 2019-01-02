package com.naonao.server.impl;

import com.naonao.server.OrderService;
import com.naonao.server.PaymentService;
import com.naonao.server.PriceService;

import javax.inject.Inject;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:21
 */
public class OrderServiceImpl implements OrderService {

    private final PriceService priceService;
    private final PaymentService paymentService;
    private final SessionManager sessionManager;

    private Long ordersPaid = 0L;

    @Inject
    public OrderServiceImpl(PriceService priceService, PaymentService paymentService, SessionManager sessionManager) {
        this.priceService = priceService;
        this.paymentService = paymentService;
        this.sessionManager = sessionManager;
    }


    @Override
    public void sendToPayment(Long orderId) {
       Long price =  priceService.getPrice(orderId);
       paymentService.pay(orderId,price,sessionManager.getSessionId());

    //    todo
        ordersPaid = ordersPaid + 1;
    }

}
