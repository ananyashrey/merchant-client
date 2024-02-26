package com.mb2.merchant.payments.gateway.service.client.testconstants.mandate;

/**
 * @author itika.agrawal
 */
public class MandateTransactionStatusJsons {

    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchant\": {\n" +
            "        \"merchantId\": \"TESTMERCHANT\",\n" +
            "        \"merchantDevice\": {\n" +
            "            \"appId\": \"com.Kotak.upi\"\n" +
            "        }\n" +
            "    },\n" +
            "    \"mandate\": {\n" +
            "        \"txnId\": \"KMBd33kiran007radhifufhffff\",\n" +
            "        \"umn\": \"MBT03d953138aeb43a88f4a0a4a27bf7@kotak\",\n" +
            "        \"reqId\": \"1564789632fgrtdeswderfdeswe14dxe4\"\n" +
            "    }\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "  \"merchantCode\": \"TESTMERCHANT\",\n" +
            "  \"reqId\": \"1564789632fgrtdeswderfdeswe14dxe4\",\n" +
            "  \"txnId\": \"KMBd33kiran007radhifufhffff\",\n" +
            "  \"umn\": \"MBT03d953138aeb43a88f4a0a4a27bf7@kotak\",\n" +
            "  \"aggreCode\": \"JARVISAGR4\"\n" +
            "}";

    public static final String oliveResponse = "{\n" +
            "  \"code\": \"00\",\n" +
            "  \"result\": \"success\",\n" +
            "  \"data\": \"MBT03d953138aeb43a88f4a0a4a27bf7@kotak\"\n" +
            "}";

    public static final String apiResponse = "{\n" +
            "    \"responseCode\": \"00\",\n" +
            "    \"responseMessage\": \"success\",\n" +
            "    \"data\": {\n" +
            "        \"umn\": \"MBT03d953138aeb43a88f4a0a4a27bf7@kotak\"\n" +
            "    }\n" +
            "}";
}
