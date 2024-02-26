package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class MerchantMaintenanceJsons {
    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\": \"agr001\",\n" +
            "    \"merchant\": {\n" +
            "        \"merchantId\": \"mer001\",\n" +
            "        \"merchantMobile\": 919849345678,\n" +
            "        \"merchantName\": \"testMerchant\",\n" +
            "        \"mccCode\": 1234\n" +
            "    },\n" +
            "    \"poolAccount\": \"123578XXXXXXX\",\n" +
            "    \"address\": {\n" +
            "        \"city\": \"Bangalore\",\n" +
            "        \"pincode\": 560001,\n" +
            "        \"stateCode\": \"KA\",\n" +
            "        \"fullAddress\": \"Bangalore\"\n" +
            "    },\n" +
            "    \"requestId\": 5847,\n" +
            "    \"requestAt\": \"01-06-2018 17:15:14\"\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "    \"aggregatorCode\": \"agr001\",\n" +
            "    \"legalName\": \"testMerchant\",\n" +
            "    \"mccCode\": \"1234\",\n" +
            "    \"merAddrress\": \"Bangalore\",\n" +
            "    \"merchantCode\": \"mer001\",\n" +
            "    \"notificationNum\": \"919849345678\",\n" +
            "    \"poolAccountNum\": \"123578XXXXXXX\",\n" +
            "    \"requestdate\": \"01-06-2018 17:15:14\",\n" +
            "    \"requestid\": 5847\n" +
            "}";

    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"Merchant details updated successfully\",\n" +
            "    \"data\": \"00\",\n" +
            "    \"responsedate\": \"01-06-2018 17:15:14\",\n" +
            "    \"requestid\": 5847\n" +
            "}";

    public static final String apiResponse = "{\n" +
            "    \"responseCode\": \"00\",\n" +
            "    \"responseMessage\": \"Merchant details updated successfully\",\n" +
            "    \"data\": \"00\",\n" +
            "    \"requestId\": 5847,\n" +
            "    \"responseAt\": \"01-06-2018 17:15:14\"\n" +
            "}";
}
