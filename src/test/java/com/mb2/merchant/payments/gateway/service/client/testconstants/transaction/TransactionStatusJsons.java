package com.mb2.merchant.payments.gateway.service.client.testconstants.transaction;

public class TransactionStatusJsons {
    public static final String checksum = "FWKpwBnuOyIDUe6OdGESI8gg26RdaonLgJBkQlVtU2AtDv/yVQr7xNbGdnEsJ1r6";

    public static final String apiRequest ="{" +
            "\"merchantUpiVpa\":\"merchnatVpa@kotak\"," +
            "\"paymentMethod\":\"UPI\"," +
            "\"merchantMobile\":\"919087654321\"," +
            "\"txnId\":\"KMB023432svsff234324sdvsvsvv234345\"" +
            "}";


    public static final String oliveRequest="{\n" +
            "\"aggregatorVPA\": \"merchnatVpa@kotak\"," +
            " \n\"customerId\": \"919087654321\"," +
            "\n\"tranid\": \"KMB023432svsff234324sdvsvsvv234345\"\n}" +
            "\n";

    public static final String oliveResponse ="{\n" +
        "    \"code\": \"00\",\n  " +
        "  \"result\": \"Success\",\n   " +
        " \"data\": {\n     " +
            "   \"status\": \"Success\",\n   " +
            "     \"amount\": \"12.45\",\n    " +
            "    \"aggregatorVPA\": \"merchnatVpa@kotak\",\n     " +
            "   \"payerVPA\": \"payervpa@kotak\",\n     " +
            "   \"txnid\": \"KMB023432svsff234324sdvsvsvv234345\",\n    " +
            "    \"orderid\": \"123456\",\n    " +
            "    \"payerName\": \"John Doe\",\n      " +
            "  \"referenceId\": \"804014035129\",\n    " +
            "    \"txntime\": \"2023-12-06 15:45:00\"\n  " +
        "  }\n}";

    public static final String apiResponse = "{\n " +
            " \"responseCode\": \"00\",\n " +
            " \"responseMessage\": \"Success\",\n " +
            " \"data\": {\n    \"payerVpa\": \"payervpa@kotak\",\n  " +
                "  \"payerName\": \"John Doe\",\n   " +
                " \"payeeVpa\": \"merchnatVpa@kotak\",\n  " +
                "  \"amount\": \"12.45\",\n  " +
                "  \"orderId\": \"123456\",\n  " +
                "  \"referenceId\": \"804014035129\",\n  " +
                "  \"txnId\": \"KMB023432svsff234324sdvsvsvv234345\",\n " +
                "   \"txnStatus\": \"Success\",\n   " +
                " \"txnTime\": \"2023-12-06 15:45:00\",\n  " +
                "  \"paymentMethod\": \"UPI\"\n " +
            " }\n}";

}
