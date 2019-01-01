package com.naonao.giucedemo.helloworlddemo;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Description:
 * @Author: HuangHaodong
 * @Date: 2019-01-01 18:13
 */
@Retention(RetentionPolicy.RUNTIME)
@BindingAnnotation
public @interface Output {

}
