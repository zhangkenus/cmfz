package com.zy.cmfz.utils;



import org.apache.commons.codec.digest.DigestUtils;

import java.util.Random;

/**
 * 工具类，获取随机盐 加密等
 * @Author:zy
 * @Date: 2018-07-04 17:11
 * @Description:
 */
public class ManagerUtils {

    /**
     * 获取随机盐
     * @return
     */
    public static String getSalt(){
        Random random = new Random();

        String s = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        StringBuilder str = new StringBuilder();

        int size = s.length();

        for(int i = 0 ; i < 5 ; i++){
            int n = random.nextInt(size - 1);
            str = str.append(s.charAt(n));
        }

        return str.toString();
    }


    /**
     * 拼接私盐和密码并md5加密
     * @param password
     * @param salt
     * @return
     */
    public static String passwordMd5(String password , String salt){

        return  DigestUtils.md5Hex(password + salt);
    }

    /**
     * 获取id
     * @param name
     * @return
     */
    /*public static String getId(String name ){
        return name + new Date
    }*/
}
