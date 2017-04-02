package com.example.util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * Created by zsj on 2017/3/23.
 */
public class Md5 {

    public static String getMd5(String message){
        String md5str = "";
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(message.getBytes());
            md5str = new BigInteger(1,messageDigest.digest()).toString(16);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  md5str;
    }
}
