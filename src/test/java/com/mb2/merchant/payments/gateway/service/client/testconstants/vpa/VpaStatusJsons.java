package com.mb2.merchant.payments.gateway.service.client.testconstants.vpa;

public class VpaStatusJsons {
    public static final String checksum = "dMogJ/KiAHDWz7qjPUvySOdlIq5Umtm2ZDPiEiFiyULIwF6d9ImtwIV5Esf8DRhV";

    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchantId\": \"TESTHARSHIT100\",\n" +
            "    \"vpa\": \"testmerchantharshit@kotak\",\n" +
            "    \"action\": \"ENABLE\"\n" +
            "}";
    public static final String oliveRequest = "{\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchantId\": \"TESTHARSHIT100\",\n" +
            "    \"vpa\": \"testmerchantharshit@kotak\",\n" +
            "    \"action\": \"enable\"\n" +
            "}";
    public static final String apiResponse = "{\n" +
            "  \"responseCode\": \"00\",\n" +
            "  \"responseMessage\": \"Success\",\n" +
            "  \"data\": \"Successfully enable\"\n" +
            "}";
    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"Success\",\n" +
            "    \"data\": \"Successfully enable\"\n" +
            "}";
}
