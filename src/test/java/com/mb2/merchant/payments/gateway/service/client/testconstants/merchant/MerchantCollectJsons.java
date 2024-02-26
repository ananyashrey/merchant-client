package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class MerchantCollectJsons {
    public static final String checksum = "Fo5gAv2X2knnhbKN7uN11qYkD3hWK7CN7rx8GTAIfLpm/knPZ3jGyUGTEuFAgfrr";

    public static final String apiRequest = "{\n" +
            "    \"merchantId\": \"TESTMERCHANT\",\n" +
            "    \"merchantMobile\": \"919782168689\",\n" +
            "    \"merchantDeviceDetails\": {\n" +
            "        \"app\":\"com.uatcashe.upi\",\n" +
            "        \"merchantMobile\": \"919782168689\"\n" +
            "    },\n" +
            "    \"subMerchantId\": \"merm0001\",\n" +
            "    \"payerVpa\": \"sunilsksk@kotak\",\n" +
            "    \"payeeVpa\": \"testmerchantaman@kotak\",\n" +
            "    \"orderId\": \"1234566\",\n" +
            "    \"amount\": \"4.74\",\n" +
            "    \"expiryInMins\": \"64400\",\n" +
            "    \"txnId\": \"KMBMCASHE3f32323fghfghfhg340\",\n" +
            "    \"requestAt\": \"2020-05-05T18:13:02.517Z\",\n" +
            "    \"remarks\": \"Merchant collect\"\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "    \"aggregatorVPA\": \"testmerchantaman@kotak\",\n" +
            "    \"amount\": \"4.74\",\n" +
            "    \"customerId\": \"919782168689\",\n" +
            "    \"deviceDetails\": {\n" +
            "        \"app\": \"com.uatcashe.upi\",\n" +
            "        \"mobile\": \"919782168689\"\n" +
            "    },\n" +
            "    \"expiry\": \"64400\",\n" +
            "    \"orderId\": \"1234566\",\n" +
            "    \"payerVpa\": \"sunilsksk@kotak\",\n" +
            "    \"remarks\": \"Merchant collect\",\n" +
            "    \"timeStamp\": \"2020-05-05T18:13:02.517Z\",\n" +
            "    \"merchantReferenceCode\": \"TESTMERCHANT\",\n" +
            "    \"subMerchantReferenceid\": \"merm0001\",\n" +
            "    \"txnId\": \"KMBMCASHE3f32323fghfghfhg340\"\n" +
            "}";

    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"Accepted Collect Request\",\n" +
            "    \"data\": {\n" +
            "        \"orderId\": \"1234566\",\n" +
            "        \"referenceId\": \"333100070205\",\n" +
            "        \"payerVpa\": \"sunilsksk@kotak\",\n" +
            "        \"payerName\": \"customerName\",\n" +
            "        \"txnId\": \"KMBMCASHE3f32323fghfghfhg340\",\n" +
            "        \"aggregatorVPA\": \"testmerchantaman@kotak\",\n" +
            "        \"expiry\": \"64400\",\n" +
            "        \"amount\": \"4.74\",\n" +
            "        \"timeStamp\": \"2020-05-05T18:13:02.517Z\"\n" +
            "    }\n" +
            "}";

    public static final String apiResponse = "{\n" +
            "    \"responseCode\": \"00\",\n" +
            "    \"responseMessage\": \"Accepted Collect Request\",\n" +
            "    \"data\": {\n" +
            "        \"payerVpa\": \"sunilsksk@kotak\",\n" +
            "        \"payeeVpa\": \"testmerchantaman@kotak\",\n" +
            "        \"orderId\": \"1234566\",\n" +
            "        \"amount\": \"4.74\",\n" +
            "        \"expiryInMins\": \"64400\",\n" +
            "        \"referenceId\": \"333100070205\",\n" +
            "        \"txnId\": \"KMBMCASHE3f32323fghfghfhg340\",\n" +
            "        \"requestAt\": \"2020-05-05T18:13:02.517Z\"\n" +
            "    }\n" +
            "}";
}
