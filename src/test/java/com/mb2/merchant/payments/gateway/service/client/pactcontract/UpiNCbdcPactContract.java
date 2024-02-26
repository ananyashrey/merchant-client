package com.mb2.merchant.payments.gateway.service.client.pactcontract;

import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantCollectJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantIdAvailabilityJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantPayJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.merchant.MerchantRegistrationJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.transaction.TransactionStatusJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaAvailableJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaStatusJsons;
import com.mb2.merchant.payments.gateway.service.client.testconstants.vpa.VpaVerifyJsons;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

import static com.mb2.merchant.payments.gateway.service.client.testconstants.TestConstants.*;

@RequiredArgsConstructor
@Component
public class UpiNCbdcPactContract {

    @Autowired
    ObjectMapper objectMapper;

    public RequestResponsePact generateContract(PactDslWithProvider builder) {

        Map<String, String> responseHeaders = new HashMap<>();
        responseHeaders.put(CONTENT_TYPE_HEADER_KEY, CONTENT_TYPE);


        return builder
                // Merchant ID Availability API
                .given(REST_METHOD_POST)
                .uponReceiving("MERCHANT ID AVAILABILITY REQUEST")
                .path("/merchant/available")
                .method(REST_METHOD_POST)
                .body(MerchantIdAvailabilityJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, MerchantIdAvailabilityJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(MerchantIdAvailabilityJsons.apiResponse)

                // Merchant Collect API
                .given(REST_METHOD_POST)
                .uponReceiving("MERCHANT COLLECT REQUEST")
                .path("/merchant/collect")
                .method(REST_METHOD_POST)
                .body(MerchantCollectJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, MerchantCollectJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(MerchantCollectJsons.apiResponse)

                // Merchant Registration API
                .given(REST_METHOD_POST)
                .uponReceiving("MERCHANT REGISTRATION REQUEST")
                .path("/merchant/onboard")
                .method(REST_METHOD_POST)
                .body(MerchantRegistrationJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, MerchantRegistrationJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(MerchantRegistrationJsons.apiResponse)

                // Merchant Pay API
                .given(REST_METHOD_POST)
                .uponReceiving("MERCHANT PAY REQUEST")
                .path("/merchant/pay")
                .method(REST_METHOD_POST)
                .body(MerchantPayJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, MerchantPayJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(MerchantPayJsons.apiResponse)

                // VPA AVAILABLE API
                .given(REST_METHOD_POST)
                .uponReceiving("VPA AVAILABLE REQUEST")
                .path("/vpa/available")
                .method(REST_METHOD_POST)
                .body(VpaAvailableJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, VpaAvailableJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(VpaAvailableJsons.apiResponse)

                // VPA CREATE API
                .given(REST_METHOD_POST)
                .uponReceiving("VPA CREATE REQUEST")
                .path("/vpa")
                .method(REST_METHOD_POST)
                .body(VpaJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, VpaJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(VpaJsons.apiResponse)

                // VPA STATUS API
                .given(REST_METHOD_POST)
                .uponReceiving("VPA STATUS REQUEST")
                .path("/vpa/status")
                .method(REST_METHOD_POST)
                .body(VpaStatusJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, VpaStatusJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(VpaStatusJsons.apiResponse)

                // VPA VERIFY API
                .given(REST_METHOD_POST)
                .uponReceiving("VPA VERIFY REQUEST")
                .path("/vpa/verify")
                .method(REST_METHOD_POST)
                .body(VpaVerifyJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, VpaVerifyJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(VpaVerifyJsons.apiResponse)

                // TRANSACTION STATUS API
                .given(REST_METHOD_POST)
                .uponReceiving("TRANSACTION STATUS REQUEST")
                .path("/transaction/status")
                .method(REST_METHOD_POST)
                .body(TransactionStatusJsons.apiRequest)
                .headers(AUTHORIZATION_HEADER_KEY, AUTHORIZATION_HEADER_VALUE)
                .headers(X_CHECK_KEY, TransactionStatusJsons.checksum)
                .headers(X_VERIFY_HEADER_KEY, X_VERIFY_HEADER_VALUE)
                .willRespondWith()
                .status(200)
                .headers(responseHeaders)
                .body(TransactionStatusJsons.apiResponse)

                .toPact();
    }
}