package com.briup.apps.ej.config;

import com.briup.apps.ej.utils.Message;
import com.briup.apps.ej.utils.MessageUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: app01
 * @description: 异常处理类
 * @author: rui
 * @create: 2019-03-13 21:03
 **/
@RestControllerAdvice
public class CustomerExceptionHandler {

    @ExceptionHandler(value = Exception.class) // 捕获 Controller 中抛出的指定类型的异常，也可以指定其他异常
    public <E> Message handler(Exception exception) {
        exception.printStackTrace();
        return MessageUtil.error(exception.getMessage());

        /*if (exception instanceof CustomerException){
            CustomerException customException = (CustomerException) exception;
            exception.printStackTrace();
            return MessageUtil.error(customException.getCode(), customException.getMessage());
        } else {
            exception.printStackTrace();
            return MessageUtil.error(500, "异常信息：" + exception.getMessage());
        }*/
    }
}
