package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class MerchantCcOnUpiActionJsons {

    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\": \"BBPS000001\",\n" +
            "    \"merchantId\": \"BBPS1\",\n" +
            "    \"action\": \"ENABLE\"\n" +
            "}";
    public static final String oliveRequest = "{\n" +
            "    \"aggregatorId\": \"BBPS000001\",\n" +
            "    \"merchantId\": \"BBPS1\",\n" +
            "    \"action\": \"enable\"\n" +
            "}";
    public static final String apiResponse = "{\n" +
            "  \"responseCode\": \"00\",\n" +
            "  \"responseMessage\": \"SUCCESS\",\n" +
            "  \"data\": \"Successfully enable\"\n" +
            "}";
    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"SUCCESS\",\n" +
            "    \"data\": \"Successfully enable\"\n" +
            "}";
}
