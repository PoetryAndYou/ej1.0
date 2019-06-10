package com.briup.apps.ej.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author rui
 * @create 2019-06-05 15:37
 */
public class MessageUtil {
    /**
     * 用于增删改
     *
     * @param msg
     * @return
     */
    private static SimpleDateFormat slf = new SimpleDateFormat("HH点mm分ss秒");

    public static Message message(String msg) {
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        return message;
    }

    public static Message message(String msg, Object data) {
        Message message = new Message();
        message.setStatus(200);
        message.setMessage(msg);
        message.setData(data);
        message.setTimestamp(slf.format(new Date().getTime()));
        return message;
    }

    public static Message error(String msg) {
        Message message = new Message();
        message.setStatus(500);
        message.setMessage(msg);
        return message;
    }
}
