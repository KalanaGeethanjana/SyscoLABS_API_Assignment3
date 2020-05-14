package com.sysco.sample.api.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.syscolab.qe.core.common.LoggerUtil;

import java.io.IOException;

public class JacksonUtil {


    public static String convertObjectToJsonString(Object obj) {
        try {
            return new ObjectMapper().configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).writerFor(obj.getClass()).writeValueAsString(obj);
        } catch (IOException e) {
            LoggerUtil.logERROR(e.getMessage(), e);
        }
        return "";
    }
}
