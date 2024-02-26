package com.mb2.merchant.payments.gateway.service.client.testconstants.vpa;

public class VpaAvailableJsons {
    public static final String checksum = "prCIYc/65A0NfT7C5sn3N/KCKYvGZNMs3msYLyxGKpenZbgIRgC8YQLoZzfbOwwu";

    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\": \"BBPS000001\",\n" +
            "    \"merchantId\": \"BBPS1\",\n" +
            "    \"vpa\": \"bbp@kotak\"\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "    \"aggregatorId\": \"BBPS000001\",\n" +
            "    \"merchantId\": \"BBPS1\",\n" +
            "    \"vpa\": \"bbp@kotak\"\n" +
            "}";
    public static final String apiResponse = "{\n" +
            "  \"responseCode\": \"00\",\n" +
            "  \"responseMessage\": \"SUCCESS\",\n" +
            "  \"data\": \"VPA AVAILABLE\"\n" +
            "}";
    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"SUCCESS\",\n" +
            "    \"data\": \"VPA AVAILABLE\"\n" +
            "}";
}
