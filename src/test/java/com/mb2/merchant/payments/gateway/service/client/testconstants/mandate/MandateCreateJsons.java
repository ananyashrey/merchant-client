package com.mb2.merchant.payments.gateway.service.client.testconstants.mandate;

/**
 * @author itika.agrawal
 */
public class MandateCreateJsons {

    public static final String apiRequest = "{\n" +
            "  \"mandateName\": \"Merchant Mandate\",\n" +
            "  \"aggregatorId\": \"JARVISAGR4\",\n" +
            "  \"merchant\": {\n" +
            "    \"merchantId\": \"TESTMERCHANT\",\n" +
            "    \"merchantMobile\": \"919782168689\",\n" +
            "    \"mccCode\": \"1520\",\n" +
            "    \"merchantDevice\": {\n" +
            "      \"appId\": \"com.yoeki.upi\",\n" +
            "      \"capability\": \"011001\",\n" +
            "      \"gcmId\": \"babdkjbakjb\",\n" +
            "      \"geocode\": \"0.0,0.0\",\n" +
            "      \"id\": \"147852369852369\",\n" +
            "      \"ip\": \"10.240.25.65\",\n" +
            "      \"location\": \"Hyderabad\",\n" +
            "      \"mobile\": \"919782168689\",\n" +
            "      \"os\": \"Android\",\n" +
            "      \"type\": \"MOB\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"payee\": {\n" +
            "    \"vpa\": \"olivetest@kotak\",\n" +
            "    \"name\": \"olive\"\n" +
            "  },\n" +
            "  \"payer\": {\n" +
            "    \"vpa\": \"AC001@kotak\",\n" +
            "    \"name\": \"AC001 Tech Ltd\"\n" +
            "  },\n" +
            "  \"mandate\": {\n" +
            "    \"initiatedBy\": \"PAYEE\",\n" +
            "    \"txnId\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "    \"validityStartDate\": \"29-11-2021\",\n" +
            "    \"validityEndDate\": \"27-12-2021\",\n" +
            "    \"amountRule\": \"EXACT\",\n" +
            "    \"amountRuleValue\": \"3.00\",\n" +
            "    \"recurrence\": \"ONETIME\",\n" +
            "    \"recurrenceRule\": \"BEFORE\",\n" +
            "    \"recurrenceValue\": \"3\",\n" +
            "    \"expiryInMins\": \"64800\",\n" +
            "    \"purposeType\": \"ONETIME\",\n" +
            "    \"revocable\": true,\n" +
            "    \"blockFund\": true,\n" +
            "    \"reqId\": \"123456\",\n" +
            "    \"orderId\": \"123456\"\n" +
            "  },\n" +
            "  \"refUrl\": \"https://\",\n" +
            "  \"remarks\": \"string\"\n" +
            "}";

    public static final String oliveRequest = "{\n" +
            "  \"aggregatorCode\": \"JARVISAGR4\",\n" +
            "  \"amountRule\": \"EXACT\",\n" +
            "  \"amountRuleValue\": \"3.00\",\n" +
            "  \"blockFund\": \"Y\",\n" +
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
            "  \"expiry\": \"64800\",\n" +
            "  \"initiatedBy\": \"PAYEE_INITIATED\",\n" +
            "  \"mandateName\": \"Merchant Mandate\",\n" +
            "  \"merchantCode\": \"TESTMERCHANT\",\n" +
            "  \"orderId\": \"123456\",\n" +
            "  \"payeeAddr\": \"olivetest@kotak\",\n" +
            "  \"payeeName\": \"olive\",\n" +
            "  \"payerAddr\": \"AC001@kotak\",\n" +
            "  \"payerName\": \"AC001 Tech Ltd\",\n" +
            "  \"recurrence\": \"ONETIME\",\n" +
            "  \"recurrenceRule\": \"BEFORE\",\n" +
            "  \"recurrenceValue\": \"3\",\n" +
            "  \"refCategory\": \"00\",\n" +
            "  \"refUrl\": \"https://\",\n" +
            "  \"remarks\": \"string\",\n" +
            "  \"reqId\": \"123456\",\n" +
            "  \"revocable\": \"Y\",\n" +
            "  \"txnId\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "  \"validityEnd\": \"27122021\",\n" +
            "  \"validityStart\": \"29112021\",\n" +
            "  \"initmode\": \"00\",\n" +
            "  \"purposecode\": \"11\",\n" +
            "  \"payeemcc\": \"1520\"\n" +
            "}";

    public static final String oliveResponse = "{\n" +
            "    \"code\": \"00\",\n" +
            "    \"result\": \"Success\",\n" +
            "    \"data\": \"215118404179\",\n" +
            "    \"umn\": null,\n" +
            "    \"txnid\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "    \"voucher_uuid\": null\n" +
            "}";

    public static final String apiResponse = "{\n" +
            "    \"responseCode\": \"00\",\n" +
            "    \"responseMessage\": \"Success\",\n" +
            "    \"data\": {\n" +
            "        \"rrn\": \"215118404179\",\n" +
            "        \"umn\": null,\n" +
            "        \"txnId\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "        \"voucherUuid\": null\n" +
            "    }\n" +
            "}";
}
