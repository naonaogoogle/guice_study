package com.naonao.giucedemo;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.naonao.giucedemo.helloworlddemo.HelloWorldModule;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:00
 */
public class MainModule extends AbstractModule {

    @Override
    protected void configure() {
        install(new HelloWorldModule());
    }

   @Provides
   private String getString() {
        return "Hello World";

    }
}
