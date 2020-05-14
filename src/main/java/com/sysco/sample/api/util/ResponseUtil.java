package com.sysco.sample.api.util;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jayway.restassured.response.Response;
import com.syscolab.qe.core.api.restassured.RestUtil;
import com.syscolab.qe.core.common.LoggerUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class ResponseUtil {

    public static int getResponseStatus(Response response){
        return RestUtil.getResponseCode(response);
    }

    /**
     *
     * @param response
     * @param class Name to map the response.
     * @return
     */
    public static Object getObject(String response, Class c) {
        try {
            return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(response, c);
        } catch (IOException e) {
            LoggerUtil.logERROR(e.getMessage(), e);
        }
        return null;
    }


    public static JsonNode getJsonNode(String response) {
        try {
            return new ObjectMapper().readTree(response);
        } catch (IOException e) {
            LoggerUtil.logERROR(e.getMessage(), e);
        }
        return null;
    }

    public static String getAPIToken(String response) {
        String token ="";
        try {
            JSONObject responseBody = new JSONObject(response);
            token = responseBody.getString("data");
        }catch (JSONException e){
        }finally {
            return token;
        }
    }

    public static int getStatus(Response response){
        return  response.getStatusCode();
    }

    public static String getDataValueInDataArray(String response, int dataArrayIndex, String key) throws JSONException {
        JSONArray jArray = new JSONArray(response);

        String toReturn ="";
        try {
            JSONObject responseBody = jArray.getJSONObject(dataArrayIndex);;
            toReturn = responseBody.getString(key);
        }catch (Exception e){
            e.getMessage();
        }finally {
            return toReturn;
        }
    }

    public static Object getDataObjectValueInDataArray(String response, int dataArrayIndex, Class c) throws JSONException {
        JSONArray jArray = new JSONArray(response);

        String toReturn ="";
        try {
            JSONObject responseBody = jArray.getJSONObject(dataArrayIndex);;
            return new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).readValue(responseBody.toString(), c);

        }catch (Exception e){
            e.getMessage();
        }
        return null;
    }

}




