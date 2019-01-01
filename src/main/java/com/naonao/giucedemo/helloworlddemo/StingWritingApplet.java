package com.naonao.giucedemo.helloworlddemo;

import com.google.inject.Provider;
import com.naonao.giucedemo.MyApplet;

import javax.inject.Inject;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 17:29
 */
public class StingWritingApplet implements MyApplet {


    @Inject
    public StingWritingApplet(MyDestination destination,
                              @Output Provider<String> stringProvide) {
        this.stringProvide = stringProvide;
        this.destination = destination;
    }


    private MyDestination destination;
    private Provider<String> stringProvide;


    private void printHelloWorld() {
        destination.write(stringProvide.get());
    }

    public void run() {
        printHelloWorld();
    }
}
