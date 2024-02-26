package com.mb2.merchant.payments.gateway.service.client.testconstants.mandate;

/**
 * @author itika.agrawal
 */
public class MandateCallbackJsons {

    public static final String apiRequest = "{\n" +
            "    \"amount\": \"21.00\",\n" +
            "    \"payeevpa\": \"testmerchantaman@kotak\",\n" +
            "    \"description\": \"Mandate Create\",\n" +
            "    \"type\": \"CREATE\",\n" +
            "    \"transactionreferencenumber\": \"401115651263\",\n" +
            "    \"payervpa\": \"sunilsksk@kotak\",\n" +
            "    \"transactionid\": \"KMBdKIRAN007Ralhjdixhhh\",\n" +
            "    \"aggregatorcode\": \"JARVISAGR4\",\n" +
            "    \"transactionTimestamp\": \"2024-01-11 15:58:01.104\",\n" +
            "    \"merchantcode\": \"TESTMERCHANT\",\n" +
            "    \"umn\": \"MBT03d953138aeb43a88f4a0a4a27bf7@kotak\",\n" +
            "    \"refid\": \"401115651263\",\n" +
            "    \"remarks\": \"string\",\n" +
            "    \"status\": \"SUCCESS\",\n" +
            "    \"statusCode\": \"00\"\n" +
            "}";

    public static final String merchantRequest = "{\n" +
            "    \"status\": \"SUCCESS\",\n" +
            "    \"statusCode\": \"00\",\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchant\": {\n" +
            "        \"merchantId\": \"TESTMERCHANT\"\n" +
            "    },\n" +
            "    \"mandate\": {\n" +
            "        \"mandateType\": \"CREATE\",\n" +
            "        \"description\": \"Mandate Create\",\n" +
            "        \"payerVpa\": \"sunilsksk@kotak\",\n" +
            "        \"payeeVpa\": \"testmerchantaman@kotak\",\n" +
            "        \"amount\": \"21.00\",\n" +
            "        \"txnId\": \"KMBdKIRAN007Ralhjdixhhh\",\n" +
            "        \"txnTimestamp\": \"2024-01-11 15:58:01.104\",\n" +
            "        \"txnReferenceNumber\": \"401115651263\",\n" +
            "        \"umn\": \"MBT03d953138aeb43a88f4a0a4a27bf7@kotak\",\n" +
            "        \"refId\": \"401115651263\",\n" +
            "        \"remarks\": \"string\"\n" +
            "    }\n" +
            "}";
}
