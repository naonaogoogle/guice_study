package com.naonao.thread;

import java.beans.PropertyEditorSupport;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-06 18:36
 */
public class PointEditor extends PropertyEditorSupport {

    @Override
    public String getAsText() {
        Point p = (Point) getValue();
        return "(" + p.x + ", " + p.y + ")";


    }
}
