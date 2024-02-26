package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class MerchantPayJsons {
    public static final String checksum = "K38Rl9TPJtbOnVg6njISsfxR91DCW0o1OgMmOnrDUHBGTmPwWoxE2x0E60wAh92C";

    public static final String apiRequest = "{\n" +
            "    \"merchantId\": \"merm0001\",\n" +
            "    \"merchantMobile\": \"919397123108\",\n" +
            "    \"mccCode\": \"1520\",\n" +
            "    \"merchantAccount\": {\n" +
            "        \"accountHolderName\": \"merchant name\",\n" +
            "        \"accountRefNumber\": \"4211172426\",\n" +
            "        \"accountType\": \"savings\",\n" +
            "        \"ifsc\": \"KKBK0000646\"\n" +
            "    },\n" +
            "    \"merchantDeviceDetails\": {\n" +
            "        \"app\": \"string\",\n" +
            "        \"merchantMobile\": \"919397123108\",\n" +
            "        \"type\": \"MOB\"\n" +
            "    },\n" +
            "    \"payerVpa\": \"merchantvpa@kotak\",\n" +
            "    \"payeeVpa\": \"customervpa@kotak\",\n" +
            "    \"amount\": \"1.00\",\n" +
            "    \"txnId\": \"KMBMTEST310118124749000000010000002\",\n" +
            "    \"remarks\": \"Merchant Prepay Test\",\n" +
            "    \"approvalRef\": \"123456\",\n" +
            "    \"customerRefId\": \"4444444\"\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "    \"accountholdername\": \"merchant name\",\n" +
            "    \"accrefnumber\": \"4211172426\",\n" +
            "    \"acctype\": \"savings\",\n" +
            "    \"amount\": \"1.00\",\n" +
            "    \"approvalRef\": \"123456\",\n" +
            "    \"customerRefid\": \"4444444\",\n" +
            "    \"deviceDetails\": {\n" +
            "        \"app\": \"string\",\n" +
            "        \"mobile\": \"919397123108\",\n" +
            "        \"type\": \"MOB\"\n" +
            "    },\n" +
            "    \"ifsc\": \"KKBK0000646\",\n" +
            "    \"mcc\": \"1520\",\n" +
            "    \"merchantrefid\": \"merm0001\",\n" +
            "    \"mobilenumber\": \"919397123108\",\n" +
            "    \"payeevpa\": \"customervpa@kotak\",\n" +
            "    \"payervpa\": \"merchantvpa@kotak\",\n" +
            "    \"remarks\": \"Merchant Prepay Test\",\n" +
            "    \"txnId\": \"KMBMTEST310118124749000000010000002\"\n" +
            "}";

    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"CREDITED\",\n" +
            "    \"data\": \"719117018202\"\n" +
            "}";

    public static final String apiResponse = "{\n" +
            "    \"responseCode\": \"00\",\n" +
            "    \"responseMessage\": \"CREDITED\",\n" +
            "    \"data\": {\n" +
            "        \"rrn\": 719117018202\n" +
            "    }\n" +
            "}";
}
