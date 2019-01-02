package com.naonao.server.impl;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 21:39
 */
public class SessionManagerTest {

    @Inject
    private SessionManager sessionManager;

    @Before
    public void setUp() {
        Guice.createInjector(new ServerModule()).injectMembers(this);
    }

    @Test
    public void getSessionId() throws InterruptedException {
        Long sessionId = sessionManager.getSessionId();
        Thread.sleep(1000);
        Long sessionId1 = sessionManager.getSessionId();
        assertThat(sessionId,equalTo(sessionId1));


    }
}