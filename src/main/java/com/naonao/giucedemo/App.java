package com.naonao.giucedemo;

import com.google.inject.Guice;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 17:18
 */
public class App {

    /**
     * bootstrap:
     * parse command line
     * set up evn
     * kick off main logic
     * @param args
     */
    public static void main(String[] args) {
        MyApplet mainApplet = Guice.createInjector(new MainModule()).getInstance(MyApplet.class);
        mainApplet.run();
    }




}
