package com.naonao.giucedemo.helloworlddemo;

import com.google.inject.AbstractModule;
import com.naonao.giucedemo.MyApplet;

import java.io.PrintStream;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:11
 */
public class HelloWorldModule extends AbstractModule {


    @Override
    protected void configure() {
        bind(MyApplet.class).to(StingWritingApplet.class);
        bind(MyDestination.class).to(PrintStreamWriter.class);
        bind(PrintStream.class).toInstance(System.out);
        bind(String.class).annotatedWith(Output.class).toInstance("Hello World");

    }
}
