package com.naonao.server;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:20
 */
public interface OrderService {

    void sendToPayment(Long orderId);

}
