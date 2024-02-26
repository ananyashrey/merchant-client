package com.mb2.merchant.payments.gateway.service.client.testconstants.mandate;

/**
 * @author itika.agrawal
 */
public class MandateModificationJsons {

    public static final String apiRequest = "{\n" +
            "    \"aggregatorId\": \"JARVISAGR4\",\n" +
            "    \"merchant\": {\n" +
            "        \"merchantId\": \"TESTMERCHANT\",\n" +
            "        \"merchantMobile\": \"919782168689\",\n" +
            "        \"merchantDevice\": {\n" +
            "            \"appId\": \"com.yoeki.upi\",\n" +
            "            \"capability\": \"011001\",\n" +
            "            \"gcmId\": \"babdkjbakjb\",\n" +
            "            \"geocode\": \"0.0,0.0\",\n" +
            "            \"id\": \"147852369852369\",\n" +
            "            \"ip\": \"10.240.25.65\",\n" +
            "            \"location\": \"Hyderabad\",\n" +
            "            \"mobile\": \"919782168689\",\n" +
            "            \"os\": \"Android\",\n" +
            "            \"type\": \"MOB\"\n" +
            "        }\n" +
            "    },\n" +
            "    \"mandate\": {\n" +
            "        \"initiatedBy\": \"PAYEE\",\n" +
            "        \"txnId\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "        \"umn\": \"KMB20461e07f33e4145b2ecd5ab12dba@kotak\",\n" +
            "        \"validityEndDate\": \"19-12-2024\",\n" +
            "        \"amountRule\": \"EXACT\",\n" +
            "        \"amountRuleValue\": \"5.00\",\n" +
            "        \"recurrence\": \"WEEKLY\",\n" +
            "        \"expiryInMins\": \"1440\",\n" +
            "        \"executeByPayeePSP\": \"true\",\n" +
            "        \"remarks\": \"string\"\n" +
            "    }\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "  \"aggregatorCode\": \"JARVISAGR4\",\n" +
            "  \"merchantCode\": \"TESTMERCHANT\",\n" +
            "  \"txnId\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "  \"umn\": \"KMB20461e07f33e4145b2ecd5ab12dba@kotak\",\n" +
            "  \"validityEnd\": \"19-12-2024\",\n" +
            "  \"amountRule\": \"EXACT\",\n" +
            "  \"amountRuleValue\": \"5.00\",\n" +
            "  \"expiry\": \"1440\",\n" +
            "  \"remarks\": \"string\",\n" +
            "  \"recurrence\": \"WEEKLY\",\n" +
            "  \"executeByPayeePSP\": \"Y\",\n" +
            "  \"initiatedBy\": \"PAYEE_INITIATED\",\n" +
            "  \"customerId\": \"919782168689\",\n" +
            "  \"device\": {\n" +
            "    \"app\": \"com.yoeki.upi\",\n" +
            "    \"capability\": \"011001\",\n" +
            "    \"geocode\": \"0.0,0.0\",\n" +
            "    \"id\": \"147852369852369\",\n" +
            "    \"ip\": \"10.240.25.65\",\n" +
            "    \"location\": \"Hyderabad\",\n" +
            "    \"mobile\": \"919782168689\",\n" +
            "    \"os\": \"Android\",\n" +
            "    \"type\": \"MOB\",\n" +
            "    \"gcmid\": \"babdkjbakjb\"\n" +
            "  },\n" +
            "  \"initmode\": \"00\"\n" +
            "}";

    public static final String apiResponse ="{\n" +
            "  \"responseCode\": \"00\",\n" +
            "  \"responseMessage\": \"Success\",\n" +
            "  \"data\": {\n" +
            "    \"rrn\": \"132811828247\",\n" +
            "    \"umn\": \"MBT04035d4dfcb74fd183b82f4531faf@kotak\",\n" +
            "    \"txnId\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "    \"voucherUuid\": \"null\"\n" +
            "  }\n}";

    public static final String oliveResponse = "{\n" +
            "  \"code\": \"00\",\n" +
            "  \"result\": \"Success\",\n" +
            "  \"data\": \"132811828247\",\n" +
            "  \"umn\": \"MBT04035d4dfcb74fd183b82f4531faf@kotak\",\n" +
            "  \"txnid\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "  \"voucher_uuid\": \"null\"\n}";
}
