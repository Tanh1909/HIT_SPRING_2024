package com.example.connectdatabase.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String status;
    private Object message;
    private Object data;
    public static Response Success(Object message,Object data){
        return new Response("SUCCESS",message,data);
    }
    public static Response Error( Object message){
        return new Response("FAILED",message,null);
    }
}
