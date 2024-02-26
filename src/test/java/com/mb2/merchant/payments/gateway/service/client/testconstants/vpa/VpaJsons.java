package com.mb2.merchant.payments.gateway.service.client.testconstants.vpa;

public class VpaJsons {
    public static final String checksum = "fHw4LURUzuuOYZU1wZp55MgkhbzCHlgWn/lRAzcoN2H9WmRreRYuh/go20yIm0dL";

    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchantId\": \"TESTHARSHIT\",\n" +
            "    \"vpa\": \"bbp@kotak\"\n" +
            "}";
    public static final String oliveRequest = "{\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchantId\": \"TESTHARSHIT\",\n" +
            "    \"vpa\": \"bbp@kotak\"\n" +
            "}";
    public static final String apiResponse = "{\n" +
            "  \"responseCode\": \"00\",\n" +
            "  \"responseMessage\": \"SUCCESS\",\n" +
            "  \"data\": \"MERCHANT ACCOUNT CREATED SUCCESSFULLY\"\n" +
            "}";
    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"SUCCESS\",\n" +
            "    \"data\": \"MERCHANT ACCOUNT CREATED SUCCESSFULLY\"\n" +
            "}";
}
