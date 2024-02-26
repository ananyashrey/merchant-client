package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class CbdcCallbackJsons {

    public static final String apiRequest = "{\n" +
            "    \"cbdc-txn\": {\n" +
            "        \"status\": {\n" +
            "            \"status\": \"SUCCESS\",\n" +
            "            \"errorcode\": \"U30\"\n" +
            "        },\n" +
            "        \"txn\": {\n" +
            "            \"type\": \"PAY\",\n" +
            "            \"remarks\": \"PAY\",\n" +
            "            \"amount\": \"100.00\",\n" +
            "            \"txndate\": \"20221205155702\",\n" +
            "            \"txn_id\": \"001274a09b7125b46628a050015a6f283d9\",\n" +
            "            \"ts\": \"2023-01-23T11:26:19+05:30\",\n" +
            "            \"initmode\": \"00\",\n" +
            "            \"purpose\": \"00\",\n" +
            "            \"rrn\": \"545465544323247\",\n" +
            "            \"orderid\": \"kjhgdr54678\"\n" +
            "        },\n" +
            "        \"payee\": {\n" +
            "            \"merchant\": true,\n" +
            "            \"merchantmid\": \"dummy\",\n" +
            "            \"vpa\": \"1L4Ypve6BCXEAJ8Y2JrUtpnMesMscA2tEp@sarv\",\n" +
            "            \"name\": \"sachin\",\n" +
            "            \"wallet\": \"1L4Ypve6BCXEAJ8Y2JrUtpnMesMscA2tEp\",\n" +
            "            \"kyc_type\": \"FULL\",\n" +
            "            \"mobile\": \"8888154083\",\n" +
            "            \"mcc\": \"1234\",\n" +
            "            \"tspid\": \"13424\",\n" +
            "            \"rc\": \"Y1\"\n" +
            "        },\n" +
            "        \"payer\": {\n" +
            "            \"vpa\": \"1Hkai4eQ3J4eJ946oFJL6M5iibiHZPgyAt@sarv\",\n" +
            "            \"wallet\": \"1Hkai4eQ3J4eJ946oFJL6M5iibiHZPgyAt\",\n" +
            "            \"name\": \"RIYAZ MOHAMMAD\",\n" +
            "            \"kyc_type\": \"FULL\",\n" +
            "            \"mobile\": \"919552548625\",\n" +
            "            \"tspid\": \"13424\",\n" +
            "            \"rc\": \"00\"\n" +
            "        }\n" +
            "    }\n" +
            "}";

    public static final String merchantRequest = "{\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchantId\": \"dummy\",\n" +
            "    \"payerVpa\": \"1Hkai4eQ3J4eJ946oFJL6M5iibiHZPgyAt@sarv\",\n" +
            "    \"payeeVpa\": \"1L4Ypve6BCXEAJ8Y2JrUtpnMesMscA2tEp@sarv\",\n" +
            "    \"paymentMethod\": \"CBDC\",\n" +
            "    \"txnId\": \"001274a09b7125b46628a050015a6f283d9\",\n" +
            "    \"txnStatus\": \"SUCCESS\",\n" +
            "    \"txnStatusCode\": \"U30\",\n" +
            "    \"txnTime\": \"20221205155702\",\n" +
            "    \"rrn\": 545465544323247,\n" +
            "    \"type\": \"PAY\",\n" +
            "    \"referenceId\": \"kjhgdr54678\",\n" +
            "    \"description\": null,\n" +
            "    \"remarks\": \"PAY\",\n" +
            "    \"amount\": \"100.00\",\n" +
            "    \"referenceUrl\": null\n" +
            "}";

}
