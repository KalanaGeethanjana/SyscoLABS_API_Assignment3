package com.sysco.sample.api.util;

import com.syscolab.qe.core.api.util.Headers;

import java.util.HashMap;

public class HeadersUtil {


    public static HashMap<String, String> getHeader(){
        return Headers.getHeader();
    }

//    public static HashMap<String, String> getBasicHeader(String token){
//        return Headers.getBasicHeader(token);
//    }
//
//    public static HashMap<String, String> getBasicHeader(String clientID, String clientSecret){
//        return Headers.getBasicHeader(clientID,clientSecret);
//    }

    public static HashMap<String, String> getBasicHeaders(String token) {
        HashMap<String, String> headers = new HashMap();
        headers.put("Authorization", "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6NjUwLCJpYXQiOjE1Nzk1MDY4NTV9.AbKrnzUpTBh1Z_jzZbr2CsWg5PWJ1oY-oa05UcJ8r3k");
        return headers;
    }



}
