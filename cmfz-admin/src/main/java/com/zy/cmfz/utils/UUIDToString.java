package com.zy.cmfz.utils;

import java.util.Random;
import java.util.UUID;

/**
 * @Author:zy
 * @Date: 2018-07-04 20:03
 * @Description:
 */
public class UUIDToString {

    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid.replace("-" ,"");
    }
}
