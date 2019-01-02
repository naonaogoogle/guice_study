package com.naonao.server.impl;

import javax.inject.Inject;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:22
 */
public class SessionManager {
    private final Long sessionId;

    @Inject
    public SessionManager(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getSessionId() {
        return sessionId;
    }
}
