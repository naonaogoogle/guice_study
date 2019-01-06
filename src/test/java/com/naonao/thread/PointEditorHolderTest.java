package com.naonao.thread;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-06 18:41
 */
public class PointEditorHolderTest {

    @Test
    public void getEditor() {
    }

    @Test
    public void testValue() {
        PointEditor editor = PointEditorHolder.getEditor();
        assertNotNull(editor);
        PointEditor editor1 = PointEditorHolder.getEditor();
        assert(editor.getClass().equals(PointEditor.class));
        assertEquals(editor,editor1);
    }

    @Test
    public void testNotTheSame() throws InterruptedException {
        class Holder {
            private PointEditor fromT1;
            private PointEditor fromT2;
        }
        final Holder holder = new Holder();
        Thread t1 = new Thread(() -> holder.fromT1 = PointEditorHolder.getEditor());
        Thread t2 = new Thread(() -> holder.fromT2 = PointEditorHolder.getEditor());
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        assertNotSame(holder.fromT1, holder.fromT2);



    }
}