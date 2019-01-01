package com.naonao.giucedemo.helloworlddemo;

import javax.inject.Inject;
import java.io.PrintStream;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 17:46
 */
public class PrintStreamWriter implements MyDestination {

    private PrintStream out;

    @Inject
    public PrintStreamWriter(PrintStream out) {
        this.out = out;
    }

    public void write(String hello_world) {
        out.println(hello_world);
    }
}
