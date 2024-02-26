package com.mb2.merchant.payments.gateway.service.client.testconstants.merchant;

public class MerchantRegistrationJsons {
	public static final String checksum = "OzJVBWCqDQbqf3cJ6/kg8Vt9F94VQIGYP78A9kFETUDyeaLjqNdO3ZpG35mqi5SB";

	public static final String apiRequest = "{\n"
			+ "    \"aggregator\": {\n"
			+ "        \"aggregatorId\": \"JARVISAGR4\",\n"
			+ "        \"aggregatorCode\": \"\"\n"
			+ "    },\n"
			+ "    \"merchant\": {\n"
			+ "        \"merchantId\": \"SetuDevonboard1\",\n"
			+ "        \"merchantName\": \"Dev\",\n"
			+ "        \"merchantMobile\": \"919050205871\",\n"
			+ "        \"mccCode\": \"5499\",\n"
			+ "        \"merchantEmail\": \"\",\n"
			+ "        \"merchantType\": \"SMALL\",\n"
			+ "        \"ownershipType\": \"\"\n"
			+ "    },\n"
			+ "    \"paymentMethod\": \"UPI\",\n"
			+ "    \"address\": {\n"
			+ "        \"city\": \"Bangalore\",\n"
			+ "        \"stateCode\": \"KA\",\n"
			+ "        \"pincode\": \"560001\",\n"
			+ "        \"fullAddress\": \"Bangalore\"\n"
			+ "    },\n"
			+ "    \"account\": {\n"
			+ "        \"ifsc\": \"KKBK0000958\",\n"
			+ "        \"poolAccount\": \"06432030000363\",\n"
			+ "        \"accountHolderName\": \"\",\n"
			+ "        \"accountRefNumber\": \"\",\n"
			+ "        \"accountType\": \"\"\n"
			+ "    },\n"
			+ "    \"additionalAttributes\": {\n"
			+ "        \"purpose\": \"Onboarding\",\n"
			+ "        \"ncifCheckFlag\": \"N\",\n"
			+ "        \"brand\": \"\",\n"
			+ "        \"callbackUrl\": \"\",\n"
			+ "        \"franchise\": \"\",\n"
			+ "        \"legal\": \"\",\n"
			+ "        \"storeIdentifier\": \"\",\n"
			+ "        \"terminalIdentifier\": \"\"\n"
			+ "    }\n"
			+ "}";

	public static final String oliveRequest = "{\n"
			+ "    \"address\": \"Bangalore\",\n"
			+ "    \"aggregatorId\": \"JARVISAGR4\",\n"
			+ "    \"ifsc\": \"KKBK0000958\",\n"
			+ "    \"mccCode\": \"5499\",\n"
			+ "    \"merchantId\": \"SetuDevonboard1\",\n"
			+ "    \"mobileNumber\": \"919050205871\",\n"
			+ "    \"name\": \"Dev\",\n"
			+ "    \"pincode\": \"560001\",\n"
			+ "    \"poolAccount\": \"06432030000363\",\n"
			+ "    \"purpose\": \"Onboarding\",\n"
			+ "    \"city\": \"Bangalore\",\n"
			+ "    \"ncifcheckFlag\": \"N\",\n"
			+ "    \"stateCode\": \"KA\"\n"
			+ "}";
	public static final String oliveResponse = "{\n"
			+ "    \"code\": \"00\",\n"
			+ "    \"result\": \"SUCCESS\",\n"
			+ "    \"data\": \"SetuDevonboard1\"\n"
			+ "}";
	public static final String apiResponse = "{\n"
			+ "    \"responseCode\": \"00\",\n"
			+ "    \"responseMessage\": \"SUCCESS\",\n"
			+ "    \"data\": {\n"
			+ "        \"name\": \"SetuDevonboard1\"\n"
			+ "    }\n"
			+ "}";
}
