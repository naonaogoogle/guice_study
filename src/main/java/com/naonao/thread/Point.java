package com.naonao.thread;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-06 18:35
 */

public class Point {
     int x;
     int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public Point setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Point setY(int y) {
        this.y = y;
        return this;
    }
}
