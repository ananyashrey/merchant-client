package com.mb2.merchant.payments.gateway.service.client.testconstants.vpa;

public class VpaVerifyJsons {
    public static final String checksum = "taF59hMlengpcaxxi9czMv9k5GWZPC0Ncty6ixg1HikbkylHUsKR9JhZ1xULChXk";

    public static final String apiRequest = "{\n" +
            "  \"aggregatorId\": \"agr001\",\n" +
            "  \"merchantId\": \"mer001\",\n" +
            "  \"merchantMobile\": \"919087654321\",\n" +
            "  \"customerVpa\": \"customerVpa@kotak\"\n" +
            "}";
    public static final String oliveRequest = "{\n" +
            "    \"aggregatorId\": \"agr001\",\n" +
            "    \"customerId\": \"919087654321\",\n" +
            "    \"merchantId\": \"mer001\",\n" +
            "    \"vpa\": \"customerVpa@kotak\"\n" +
            "}";
    public static final String apiResponse = "{\n" +
            "  \"responseCode\": \"00\",\n" +
            "  \"responseMessage\": \"Success\",\n" +
            "  \"data\": {\n" +
            "      \"customerName\": \"MAHESH D\",\n" +
            "      \"verifiedMerchant\": \"N\",\n" +
            "      \"ifsc\": \"KKBK0000670\"\n" +
            "  }\n" +
            "}";
    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"Success\",\n" +
            "    \"data\": \"MAHESH D\",\n" +
            "    \"ifsc\": \"KKBK0000670\",\n" +
            "    \"verifiedMerchant\": \"N\"\n" +
            "}";
}
