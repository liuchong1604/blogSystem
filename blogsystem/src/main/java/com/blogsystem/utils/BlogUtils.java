package com.blogsystem.utils;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/26 19:37
 */
public class BlogUtils {
    private static final int one_month=30*24*60*60;


     /*获取当前时间*/
    public static int getCurrentTime(){
        return (int)(System.currentTimeMillis());
    }

    /*
     * MD5加密算法
     */
    public static String MD5encode(String source){
        if(StringUtils.isBlank(source)){
            return null;
        }
        //定义一个字节数组
        byte[] secretBytes = null;
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            //对字符串进行加密
            md.update(source.getBytes());
            //获得加密后的数据
            secretBytes = md.digest();
            System.out.println(secretBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有md5这个算法！");
        }
        //将加密后的数据转换为16进制数字
        String md5code = new BigInteger(1, secretBytes).toString(16);
        // 如果生成数字未满32位，需要前面补0
        StringBuilder str = new StringBuilder();
        str.append(md5code);
        for (int i = 0; i < 32 - md5code.length(); i++) {
            str.insert(0,"0");
        }
        System.out.println(str.toString());
        return str.toString();
    }

    public static void setCookie(HttpServletResponse response, HttpSession session){
        Cookie cookie = new Cookie("JSESSIONID",session.getId());
        boolean isSSL = false;
        cookie.setMaxAge(60*30);
        cookie.setPath("/");
        cookie.setSecure(isSSL);
        response.addCookie(cookie);
    }
}
