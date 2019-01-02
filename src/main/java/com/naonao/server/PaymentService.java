package com.naonao.server;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:22
 */
public interface PaymentService {
    void pay(Long orderId, Long price, Long sessionId);
}
