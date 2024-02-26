package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class UpiCallbackJsons {

    public static final String apiRequest = "{\n" +
            "    \"transactionid\": \" KMB01ba1363715005d82a453d223eb13b777\",\n" +
            "    \"aggregatorcode\": \"aggr001\",\n" +
            "    \"merchantcode\": \"merm0001\",\n" +
            "    \"status\": \"SUCCESS\",\n" +
            "    \"statusCode\": \"00\",\n" +
            "    \"description\": \"Test\",\n" +
            "    \"remarks\": \"Test\",\n" +
            "    \"transactionreferencenumber\": \"721411361239\",\n" +
            "    \"rrn\": \"721411361239\",\n" +
            "    \"amount\": \"19.00\",\n" +
            "    \"type\": \"COLLECT\",\n" +
            "    \"payervpa\": \"Test@kotak\",\n" +
            "    \"payeevpa\": \"abc@kotak\",\n" +
            "    \"refurl\": \"https://mb.uat.kotak.com\",\n" +
            "    \"refid\": \"10000468\",\n" +
            "    \"transactionTimestamp\": \"2017-12-13 19:18:33.617\",\n" +
            "    \"checksum\": \" merm0001siva@kotakkumar@kotakKMB01ba1363715005d82a453d223e b13b7772017-12-13 19:18:33.61719.0072141136123900Funds Transfer721411361239\"\n" +
            "}";

    public static final String merchantRequest = "{\n" +
            "    \"txnId\": \" KMB01ba1363715005d82a453d223eb13b777\",\n" +
            "    \"aggregatorId\": \"aggr001\",\n" +
            "    \"merchantId\": \"merm0001\",\n" +
            "    \"txnStatus\": \"SUCCESS\",\n" +
            "    \"txnStatusCode\": \"00\",\n" +
            "    \"description\": \"Test\",\n" +
            "    \"remarks\": \"Test\",\n" +
            "    \"rrn\": \"721411361239\",\n" +
            "    \"amount\": \"19.00\",\n" +
            "    \"type\": \"COLLECT\",\n" +
            "    \"payerVpa\": \"Test@kotak\",\n" +
            "    \"payeeVpa\": \"abc@kotak\",\n" +
            "    \"paymentMethod\": \"UPI\",\n" +
            "    \"referenceUrl\": \"https://mb.uat.kotak.com\",\n" +
            "    \"referenceId\": \"10000468\",\n" +
            "    \"txnTime\": \"2017-12-13 19:18:33.617\"\n" +
            "}";

}
