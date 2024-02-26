package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class MerchantIdAvailabilityJsons {

    public static final String checksum = "73fWbZnqLa+ZuZ7zmRkcYP6U6Twz4F/ukiiOOTjcLSxIVcUz4nqTc01FLG5K2Q80";

    public static final String apiRequest = "{\n" +
            "    \"merchantId\": \"TESTMERCHANT\"\n" +
            "}";

    public static final String oliveResponse ="{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"success\",\n" +
            "    \"data\": [\"7A0D7DE6B5B0503A8044402B9653AB202887DD233378B9F3B4E72A71544B7AC0\", \"10.10.2.55\"]\n" +
            "}";

    public static final String apiResponse = "{\n" +
            "    \"responseCode\": \"00\",\n" +
            "    \"responseMessage\": \"success\",\n" +
            "    \"data\": {\n" +
            "        \"merchantKey\": \"7A0D7DE6B5B0503A8044402B9653AB202887DD233378B9F3B4E72A71544B7AC0\",\n" +
            "        \"merchantIp\": \"10.10.2.55\"\n" +
            "    }\n" +
            "}";
}
