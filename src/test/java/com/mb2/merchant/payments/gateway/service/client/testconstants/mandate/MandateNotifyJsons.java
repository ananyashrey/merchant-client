package com.mb2.merchant.payments.gateway.service.client.testconstants.mandate;

public class MandateNotifyJsons {

    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\":\"Kotak\",\n" +
            "    \"merchant\":{\n" +
            "        \"merchantId\": \"Kotak01\",\n" +
            "        \"merchantMobile\": \"919136679950\",\n" +
            "        \"merchantDevice\": {\n" +
            "            \"appId\": \"com.Kotak.upi\"\n" +
            "        }\n" +
            "    },\n" +
            "    \"mandate\":{\n" +
            "        \"payeeVpa\": \"payee@kotak\",\n" +
            "        \"payerVpa\": \"ashish.mohare@kotak\",\n" +
            "        \"txnId\": \"KMBd3397896me1643f0la543c32d6f85n29\",\n" +
            "        \"txnType\": \"CREATE\",\n" +
            "        \"amount\": \"14.00\",\n" +
            "        \"executionDateTime\": \"29-11-2021 17:20:00\",\n" +
            "        \"umn\": \"KMBfc1ccc32b3f046c5967f5f7f2e235@kotak\",\n" +
            "        \"seqNum\": \"1\",\n" +
            "        \"remarks\": \"string\"\n" +
            "    }\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "    \"umn\": \"KMBfc1ccc32b3f046c5967f5f7f2e235@kotak\",\n" +
            "    \"executiondate\": \"29-11-2021 17:20:00\",\n" +
            "    \"payeevpa\": \"payee@kotak\",\n" +
            "    \"payervpa\": \"ashish.mohare@kotak\",\n" +
            "    \"merchantcode\": \"Kotak01\",\n" +
            "    \"aggregatorcode\": \"Kotak\",\n" +
            "    \"amount\": \"14.00\",\n" +
            "    \"txnid\": \"KMBd3397896me1643f0la543c32d6f85n29\",\n" +
            "    \"appid\": \"com.Kotak.upi\",\n" +
            "    \"mobilenumber\": \"919136679950\",\n" +
            "    \"initmode\": \"00\",\n" +
            "    \"remarks\": \"string\",\n" +
            "    \"seqNum\": \"1\"\n" +
            "}";

    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"Success\",\n" +
            "    \"data\": null,\n" +
            "    \"umn\": null,\n" +
            "    \"txnid\": \"KMBd3397896me1643f0la543c32d6f85n29\",\n" +
            "    \"voucher_uuid\": null\n" +
            "}";

    public static final String apiResponse = "{\n" +
            "    \"responseCode\": \"00\",\n" +
            "    \"responseMessage\": \"Success\",\n" +
            "    \"data\": {\n" +
            "        \"rrn\": null,\n" +
            "        \"umn\": null,\n" +
            "        \"txnId\": \"KMBd3397896me1643f0la543c32d6f85n29\",\n" +
            "        \"voucherUuid\": null\n" +
            "    }\n" +
            "}";
}
