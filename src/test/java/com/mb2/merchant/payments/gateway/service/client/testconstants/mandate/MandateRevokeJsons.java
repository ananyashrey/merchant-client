package com.mb2.merchant.payments.gateway.service.client.testconstants.mandate;

public class MandateRevokeJsons {

    public static final String apiRequest = "{\n"
    		+ "    \"aggregatorId\": \"AC001\",\n"
    		+ "    \"merchant\": {\n"
    		+ "        \"merchantId\": \"MC001\",\n"
    		+ "        \"merchantMobile\": 919849345678,\n"
    		+ "        \"merchantDevice\": {\n"
    		+ "            \"appId\": \"com.AC001.upi\",\n"
    		+ "            \"capability\": \"011001\",\n"
    		+ "            \"gcmId\": \"babdkjbakjb\",\n"
    		+ "            \"geocode\": \"12.9667,77.5667\",\n"
    		+ "            \"id\": 147852369852369,\n"
    		+ "            \"ip\": \"10.240.25.65\",\n"
    		+ "            \"location\": \"Sarjapur Road, Bangalore, KA, IN\",\n"
    		+ "            \"mobile\": 919849345678,\n"
    		+ "            \"os\": \"Android\",\n"
    		+ "            \"type\": \"MOB\"\n"
    		+ "        }\n"
    		+ "    },\n"
    		+ "    \"mandate\": {\n"
    		+ "        \"txnId\": \"KMBd3397896me1643f0la543c32d6f8N003\",\n"
    		+ "        \"umn\": \"KMBfc1ccc32b3f046c5967f5f7f2e234@kotak\"\n"
    		+ "    }\n"
    		+ "}";

    public static final String oliveRequest = "{\n" +
            "  \"merchantCode\": \"MC001\",\n" +
            "  \"aggregatorCode\": \"AC001\",\n" +
            "  \"txnId\": \"KMBd3397896me1643f0la543c32d6f8N003\",\n" +
            "  \"umn\": \"KMBfc1ccc32b3f046c5967f5f7f2e234@kotak\",\n" +
            "  \"customerId\": \"919849345678\",\n" +
            "  \"device\": {\n" +
            "    \"app\": \"com.AC001.upi\",\n" +
            "    \"capability\": \"011001\",\n" +
            "    \"gcmid\": \"babdkjbakjb\",\n" +
            "    \"geocode\": \"12.9667,77.5667\",\n" +
            "    \"id\": \"147852369852369\",\n" +
            "    \"ip\": \"10.240.25.65\",\n" +
            "    \"location\": \"Sarjapur Road, Bangalore, KA, IN\",\n" +
            "    \"mobile\": \"919849345678\",\n" +
            "    \"os\": \"Android\",\n" +
            "    \"type\": \"MOB\"\n" +
            "  }\n}";
    
    

    public static final String apiResponse ="{\n" +
            "  \"responseCode\": \"00\",\n" +
            "  \"responseMessage\": \"Success\",\n" +
            "  \"data\": {\n" +
            "    \"rrn\": \"132811828247\",\n" +
            "    \"umn\": \"KMB20461e07f33e4145b2ecd5ab12dba@kotak\",\n" +
            "    \"txnId\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "    \"voucherUuid\": \"null\"\n" +
            "  }\n}";

    public static final String oliveResponse = "{\n" +
            "  \"code\": \"00\",\n" +
            "  \"result\": \"Success\",\n" +
            "  \"data\": \"132811828247\",\n" +
            "  \"umn\": \"KMB20461e07f33e4145b2ecd5ab12dba@kotak\",\n" +
            "  \"txnid\": \"KMB16olive5ad5963f0cv156c59d6f65d15\",\n" +
            "  \"voucher_uuid\": \"null\"\n}";
}
