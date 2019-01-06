package com.naonao.thread;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-06 18:36
 */
public class PointEditorHolder {

    private static ThreadLocal<PointEditor> pointEditorThreadLocal = ThreadLocal.withInitial(PointEditor::new);

    public static PointEditor getEditor() {
        return pointEditorThreadLocal.get();
    }

}
