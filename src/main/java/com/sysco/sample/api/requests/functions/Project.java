package com.sysco.sample.api.requests.functions;

import com.jayway.restassured.response.Response;
import com.sysco.sample.api.common.URIs;
import com.sysco.sample.api.util.HeadersUtil;
import com.sysco.sample.api.util.RequestUtil;
import com.syscolab.qe.core.api.util.RequestMethods;

public class Project {


    public static Response getEmployees() {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), "", URIs.retrieveEmployeeURI(), RequestMethods.GET.toString(), null);

    }

    public static Response getQcenterProjects(String uri) {
        RequestUtil.setRequestBaseUrls();
        return RequestUtil.send(HeadersUtil.getBasicHeaders(RequestUtil.getToken()), null, uri, RequestMethods.GET.toString(), null);

    }
}
