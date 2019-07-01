package com.blogsystem.entity;

/**
 * Created with IDEA
 *
 * @author chong  liu
 * @create 2019/6/26 19:19
 */
public class RestResult {
    public  int code;
    public String message;
    public  Object data;
    public static final int SUCCESS = 200;
    public static final int FAILED = 400;
    public RestResult(){

    }
    public RestResult(int code){
        this.code = code;
    }
    public RestResult(int code,String message){
        this.code = code;
        this.message = message;
    }

    public RestResult(int code,String message,Object data){
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
