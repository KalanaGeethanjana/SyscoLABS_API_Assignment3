package com.sysco.sample.api.util;

import com.jayway.restassured.response.Response;
import com.sysco.sample.api.common.Constant;
import com.syscolab.qe.core.api.restassured.RestUtil;

import java.util.Map;

public class RequestUtil {

    RequestUtil() {


    }

    public static void setRequestBaseUrls() {
        RestUtil.BASE_PATH = Constant.BASE_PATH;
        RestUtil.API_HOST = Constant.API_HOST;

    }

    public static Response send(Map<String, String> headers, String bodyString, String uri, String requestMethod, Map<String, String> queryParameters) {
        return RestUtil.send(headers, bodyString, uri, requestMethod, queryParameters);

    }


    /**
     * You can send your API request and get the token
     * Or copy paste the qcenter token from network tab
     * @return
     */
    public static String getToken() {
        return "";
    }


}
